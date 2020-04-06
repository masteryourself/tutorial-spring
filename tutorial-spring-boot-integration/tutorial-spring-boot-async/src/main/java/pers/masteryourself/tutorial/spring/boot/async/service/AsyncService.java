package pers.masteryourself.tutorial.spring.boot.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * <p>description : AsyncService
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 12:16
 */
@Service
public class AsyncService {

    @Async
    public void doSomething() {
        System.out.println("doSomething start......");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSomething end......");
    }

}
