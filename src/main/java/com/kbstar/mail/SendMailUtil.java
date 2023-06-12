package com.kbstar.mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Component
public class SendMailUtil {
    @Autowired
    JavaMailSender emailSender;
    @Value("${adminmail.id}")
    private String id;
    private MimeMessage createMessage(String to, String msg) throws Exception{

        MimeMessage message = emailSender.createMimeMessage();

        message.addRecipients(Message.RecipientType.TO, to);//보내는 대상
        message.setSubject("Kbstar 입니다.");//제목

        String msgg="";
        msgg+= "<div style='margin:10px;'>";
        msgg+= "<h2> 안녕하세요  Kbstar입니다!!! </h2>";
        msgg+= "<br>";
        msgg+= "<br>";
        msgg+= "<br>";
        msgg+= "<div align='center' style='border:1px solid black; font-family:verdana';>";
        msgg+= "<h3 style='color:blue;'>"+msg+"</h3>";
        msgg+= "</div>";

        message.setText(msgg, "utf-8", "html");//내용
        message.setFrom(new InternetAddress(id,"kbstar"));//보내는 사람

        return message;
    }
    public void sendSimpleMessage(String to, String msg)throws Exception {
        // TODO Auto-generated method stub
        MimeMessage message = createMessage(to,msg);
        try{//예외처리
            emailSender.send(message);
        }catch(MailException es){
            es.printStackTrace();
            throw new IllegalArgumentException();
        }

    }
}