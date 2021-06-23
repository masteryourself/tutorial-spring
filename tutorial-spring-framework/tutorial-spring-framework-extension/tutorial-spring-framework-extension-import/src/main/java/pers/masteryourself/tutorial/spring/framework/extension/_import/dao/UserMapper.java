package pers.masteryourself.tutorial.spring.framework.extension._import.dao;

import pers.masteryourself.tutorial.spring.framework.extension._import.integration.Select;
import pers.masteryourself.tutorial.spring.framework.extension._import.entity.User;

import java.util.List;

/**
 * <p>description : UserMapper
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 14:01
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> select();

}
