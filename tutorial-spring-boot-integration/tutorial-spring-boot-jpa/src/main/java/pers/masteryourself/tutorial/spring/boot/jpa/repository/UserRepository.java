package pers.masteryourself.tutorial.spring.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.masteryourself.tutorial.spring.boot.jpa.entity.User;

/**
 * <p>description : UserRepository
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/17 20:32
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
