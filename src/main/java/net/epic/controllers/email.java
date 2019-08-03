package net.epic.controllers;


import net.epic.domain.emailDTO;


import net.epic.services.emailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/email")
public class email {

    @Autowired
    private emailServices emailServices;

    @PostMapping("/add")
    public String addUser(@RequestBody emailDTO emailData){


        return emailServices.saveEmail(emailData);
    }


}
