package pers.masteryourself.tutorial.spring.boot.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * <p>description : MailService
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 13:08
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");
        message.setTo("renzhao.ruan@foxmail.com");
        message.setFrom("ruanrenzhao@163.com");
        //发送邮件
        javaMailSender.send(message);
    }

    public void sendMimeMail() throws Exception {
        // 1. 创建一个复杂的消息邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 2. 邮件设置
        helper.setSubject("小仓优子");
        helper.setText("<a style='color:red' href='https://baike.baidu.com/item/%E5%B0%8F%E4%BB%93%E4%BC%98%E5%AD%90/492025?fr=aladdin'>点击就可以跳转百度搜索小仓优子</a>", true);
        helper.setTo("renzhao.ruan@foxmail.com");
        helper.setFrom("ruanrenzhao@163.com");
        // 3. 上传文件
        helper.addAttachment("1.jpg", new File("C:\\Users\\rrz\\Pictures\\Saved Pictures\\小仓优子1.jpg"));
        helper.addAttachment("2.jpg", new File("C:\\Users\\rrz\\Pictures\\Saved Pictures\\小仓优子2.jpg"));
        // 4. 发送邮件
        javaMailSender.send(mimeMessage);
    }

}
