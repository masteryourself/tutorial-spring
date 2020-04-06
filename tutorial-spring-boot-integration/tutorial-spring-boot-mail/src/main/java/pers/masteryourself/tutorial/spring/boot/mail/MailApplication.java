package pers.masteryourself.tutorial.spring.boot.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pers.masteryourself.tutorial.spring.boot.mail.service.MailService;

/**
 * <p>description : MailApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 12:51
 */
@SpringBootApplication
public class MailApplication implements ApplicationRunner {

    @Autowired
    private MailService mailService;

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        mailService.sendSimpleMail();
        mailService.sendMimeMail();
    }

}
