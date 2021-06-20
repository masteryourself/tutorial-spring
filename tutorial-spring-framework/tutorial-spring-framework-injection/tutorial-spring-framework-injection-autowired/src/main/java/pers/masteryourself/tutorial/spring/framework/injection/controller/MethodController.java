package pers.masteryourself.tutorial.spring.framework.injection.controller;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.masteryourself.tutorial.spring.framework.injection.service.PersonService;

/**
 * <p>description : MethodController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 0:03
 */
@Controller
@ToString
public class MethodController {

    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService1) {
        this.personService = personService1;
    }
}
