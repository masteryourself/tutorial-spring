package pers.masteryourself.tutorial.spring.framework.extension._import.config;

import pers.masteryourself.tutorial.spring.framework.extension._import.dao.UserMapper;
import pers.masteryourself.tutorial.spring.framework.extension._import.integration.EnableMasterYourSelf;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 11:58
 */
@EnableMasterYourSelf(mappers = {UserMapper.class})
public class SpringConfig {
}
