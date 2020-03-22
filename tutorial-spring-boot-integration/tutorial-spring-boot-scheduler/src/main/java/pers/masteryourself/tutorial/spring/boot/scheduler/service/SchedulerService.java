package pers.masteryourself.tutorial.spring.boot.scheduler.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>description : SchedulerService
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 12:37
 */
@Service
public class SchedulerService {

    /**
     * 每 4s 执行一次
     * 0 * * * * MON-FRI
     * 【0 0/5 14,18 * * ?】 每天 14点 整，和 18 点整，每隔 5 分钟执行一次
     * 【0 15 10 ? * 1-6】 每个月的周一至周六 10:15 分执行一次
     * 【0 0 2 ? * 6L】每个月的最后一个周六凌晨 2 点执行一次
     * 【0 0 2 LW * ?】每个月的最后一个工作日凌晨 2 点执行一次
     * 【0 0 2-4 ? * 1#1】每个月的第一个周一凌晨 2 点到 4 点期间，每个整点都执行一次
     */
    @Scheduled(cron = "0/4 * * * * 0-7")
    public void hello() {
        System.out.println("hello：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
