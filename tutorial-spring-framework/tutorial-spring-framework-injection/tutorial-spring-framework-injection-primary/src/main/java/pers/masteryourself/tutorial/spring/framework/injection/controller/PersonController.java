package pers.masteryourself.tutorial.spring.framework.injection.controller;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.masteryourself.tutorial.spring.framework.injection.service.PersonService;

/**
 * <p>description : PersonController
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:54
 */
@ToString
@Controller
public class PersonController {

    @Autowired
    private PersonService personService2;

}
