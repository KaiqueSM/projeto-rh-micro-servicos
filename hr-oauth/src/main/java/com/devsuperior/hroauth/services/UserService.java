package com.devsuperior.hroauth.services;

import com.devsuperior.hroauth.entities.User;
import com.devsuperior.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){

        User user = userFeignClient.findByEmail(email).getBody();

        if(user == null) {
            logger.error("Email not found");
            throw new IllegalArgumentException("Email not found!");
        }

        logger.info("Email found: "+ email);
        return user;
    }

}
