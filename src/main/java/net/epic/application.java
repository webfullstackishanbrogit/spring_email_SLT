package net.epic;

import net.epic.domain.emailDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);

        //emailDTO email=new emailDTO();

        //System.out.println(email.getCreated_date());

    }
}
