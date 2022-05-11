package org.masteryourself.tutorial.spring.data.redis;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.masteryourself.tutorial.spring.data.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * <p>description : SpringDataRedisApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/5/11 7:27 PM
 */
@SpringBootApplication
public class SpringDataRedisApplication implements ApplicationRunner {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRedisApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 存储字符串对象
        stringRedisTemplate.opsForValue().set("name", "张三");
        String str = stringRedisTemplate.opsForValue().get("name");
        System.out.println(str);
        // 存储实体类型
        ObjectMapper mapper = new ObjectMapper();
        User userWrite = new User(1L, "张三");
        stringRedisTemplate.opsForValue().set("user:1", mapper.writeValueAsString(userWrite));
        String jsonStr = stringRedisTemplate.opsForValue().get("user:1");
        User readUser = mapper.readValue(jsonStr, User.class);
        System.out.println(readUser);
    }

}
