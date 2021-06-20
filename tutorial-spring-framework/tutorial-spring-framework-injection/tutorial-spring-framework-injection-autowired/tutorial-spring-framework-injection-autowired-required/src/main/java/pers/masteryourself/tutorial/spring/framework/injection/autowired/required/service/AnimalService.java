package pers.masteryourself.tutorial.spring.framework.injection.autowired.required.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.required.bean.Cat;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.required.bean.Dog;

import javax.annotation.Resource;

/**
 * <p>description : AnimalService
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/20 0:23
 */
@Service
@Data
public class AnimalService {

    @Autowired(required = false)
    private Cat cat;

    @Resource
    private Dog dog;
}
