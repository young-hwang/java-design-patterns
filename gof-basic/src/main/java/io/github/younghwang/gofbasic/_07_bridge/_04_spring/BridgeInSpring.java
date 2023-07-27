package io.github.younghwang.gofbasic._07_bridge._04_spring;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeInSpring {
    public static void main(String[] args) {
        MailSender mailSender = new JavaMailSenderImpl();

        PlatformTransactionManager jdbcTransactionManager = new JdbcTransactionManager();
    }
}
