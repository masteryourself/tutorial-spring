package pers.masteryourself.tutorial.spring.boot.mybatis.mapper;

import pers.masteryourself.tutorial.spring.boot.mybatis.entity.User;

import java.util.List;

/**
 * <p>description : UserMapper
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/16 21:45
 */
// @Mapper
public interface UserMapper {

    List<User> list();

}
