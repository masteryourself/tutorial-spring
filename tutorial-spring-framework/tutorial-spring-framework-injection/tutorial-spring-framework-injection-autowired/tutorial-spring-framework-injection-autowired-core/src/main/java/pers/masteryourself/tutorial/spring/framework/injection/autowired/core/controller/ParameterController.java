package pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller;

import lombok.Data;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.bean.SomeBean;

/**
 * <p>description : ParameterController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 0:14
 */
@Data
public class ParameterController {

    private SomeBean someBean;

    public ParameterController(SomeBean someBean) {
        this.someBean = someBean;
    }
}
