package pers.masteryourself.tutorial.spring.boot.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>description : User
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/17 20:31
 */
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name", length = 50)
    private String userName;

}
