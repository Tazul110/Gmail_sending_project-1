package com.example.demo.sms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sms.Service.EmailService;

@RestController
public class MainController {

	@Autowired
    private EmailService emailService;

    @RequestMapping("/send-email")
    public String sendEmail() {
        String to = "tazulislam@gmail.com";
        String subject = "test";
        String body = "This is a test email.";

        emailService.sendSimpleEmail(to, subject, body);
        return "Email sent successfully!";
    }
}
