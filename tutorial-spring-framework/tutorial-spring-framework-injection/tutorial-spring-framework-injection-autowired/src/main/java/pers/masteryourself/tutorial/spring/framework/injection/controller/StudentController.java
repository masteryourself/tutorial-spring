package pers.masteryourself.tutorial.spring.framework.injection.controller;

import lombok.Data;
import pers.masteryourself.tutorial.spring.framework.injection.service.PersonService;

/**
 * <p>description : StudentController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 0:14
 */
@Data
public class StudentController {

    private PersonService personService;

    /**
     * 要一个有参的构造参数
     *
     * @param personService
     */
    public StudentController(PersonService personService) {
        this.personService = personService;
    }
}
