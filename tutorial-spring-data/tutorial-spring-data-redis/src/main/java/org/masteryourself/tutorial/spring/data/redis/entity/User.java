package org.masteryourself.tutorial.spring.data.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description : User
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/5/11 7:38 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Long id;

    private String name;

}
