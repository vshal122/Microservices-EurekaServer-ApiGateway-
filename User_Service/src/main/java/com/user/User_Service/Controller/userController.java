package com.user.User_Service.Controller;


import com.user.User_Service.Model.User;
import com.user.User_Service.Services.IServicesUser;
import com.user.User_Service.Services.ServicesUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    IServicesUser iServicesUser;

    @Autowired
     RestTemplate restTemplate;


    @GetMapping("/get/{id}")
    public User getUserdetails(@PathVariable("id") Long id)
    {
       User user=iServicesUser.getUser(id);
       List list =restTemplate.getForObject("http://contact-service/contact/getcontact/"+user.getUserId(), List.class);
       user.setContactList(list);
       return user;
    }
}
