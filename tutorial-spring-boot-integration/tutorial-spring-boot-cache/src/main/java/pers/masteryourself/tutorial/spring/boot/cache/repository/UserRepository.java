package pers.masteryourself.tutorial.spring.boot.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.masteryourself.tutorial.spring.boot.cache.entity.User;

/**
 * <p>description : UserRepository
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 22:29
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
