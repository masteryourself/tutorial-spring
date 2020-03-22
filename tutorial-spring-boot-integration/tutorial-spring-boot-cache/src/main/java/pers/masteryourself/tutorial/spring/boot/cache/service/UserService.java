package pers.masteryourself.tutorial.spring.boot.cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.boot.cache.entity.User;
import pers.masteryourself.tutorial.spring.boot.cache.repository.UserRepository;

/**
 * <p>description : UserService
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 22:36
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(cacheNames = "user", key = "#root.args[0]")
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @CachePut(cacheNames = "user", key = "#user.id")
    public User update(User user) {
        System.out.println("更新值：" + user);
        return userRepository.saveAndFlush(user);
    }

    @CacheEvict(cacheNames = "user", beforeInvocation = true, key = "#id")
    public void delete(Integer id) {
        System.out.println("删除用户：" + id);
        //userRepository.deleteById(id);
    }

}
