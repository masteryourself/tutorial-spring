package pers.masteryourself.tutorial.spring.framework.injection.autowired.multi.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.multi.bean.Animal;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.multi.bean.Cat;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.multi.bean.Dog;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    @Resource
    private Cat cat;

    @Resource
    private Dog dog;

    @Resource
    private List<Animal> animalList;

    @Autowired
    private Map<String,Animal> animalMap;

    @Resource
    private Set<Animal> animalSet;

}
