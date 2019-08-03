package net.epic.services;


import net.epic.domain.emailDTO;
import org.springframework.stereotype.Service;


@Service
public interface emailServices{

    String saveEmail(emailDTO emailData);



}
