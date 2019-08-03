package net.epic.services.impl;



import net.epic.domain.emailDTO;
import net.epic.repositories.emailRepositories;
import net.epic.services.emailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.ZoneId;
import java.util.Date;



@Service
public class emailServiceImpl implements emailServices {

    @Autowired
    private emailRepositories emailRepositories;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public String saveEmail(emailDTO emailData) {

        LocalDate localDate = LocalDate.now();
        //LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();


        Date date_out = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date time_out = Date.from( localDateTime.atZone( ZoneId.systemDefault()).toInstant());

        emailData.setCreated_date(date_out);
        emailData.setCreated_time(time_out);
        emailRepositories.save(emailData);


        try {
            send_mail(emailData);

        }catch (Exception e){
            e.printStackTrace();
        }

        return "Data Saved inside database";



    }

    private String send_mail(emailDTO emailData) {
        //emailDTO mail_obj=new emailDTO();
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(emailData.getFrom());
        msg.setTo(emailData.getTo());

        msg.setSubject("Testing from Spring Boot");
        msg.setText(emailData.getMag_body());

        javaMailSender.send(msg);
        return "mail was send";
    }


}
