package pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.bean.SomeBean;

/**
 * <p>description : FiledController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:49
 */
@Controller
@ToString
public class FiledController {

    @Autowired
    private SomeBean someBean2;

}
