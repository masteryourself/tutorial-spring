package pers.masteryourself.tutorial.spring.framework.injection.controller;

import lombok.ToString;
import org.springframework.stereotype.Controller;
import pers.masteryourself.tutorial.spring.framework.injection.service.PersonService;

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

    private PersonService personService;

    /*@Autowired*/
    public ConstructController(/*@Autowired*/ PersonService personService2) {
        this.personService = personService2;
    }
}
