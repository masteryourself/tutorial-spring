package pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller;

import lombok.ToString;
import org.springframework.stereotype.Controller;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.bean.SomeBean;

/**
 * <p>description : ConstructController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 0:09
 */
@Controller
@ToString
public class ConstructController {

    private SomeBean someBean;

    /*@Autowired*/
    public ConstructController(/*@Autowired*/ SomeBean someBean2) {
        this.someBean = someBean2;
    }
}
