package io.github.younghwang.gofbasic._10_facade._02_after;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        emailSettings.setFrom("young@mail.com");
        emailSettings.setTo("guest@mail.com");
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setSubject("subject");
        emailMessage.setText("message");
        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);
    }
}
