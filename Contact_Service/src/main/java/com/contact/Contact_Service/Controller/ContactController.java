package com.contact.Contact_Service.Controller;

import com.contact.Contact_Service.Model.Contact;
import com.contact.Contact_Service.Services.IContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ontroller {

    @Autowired
   private  IContactServices iContactServices;

    @GetMapping("/getcontact/{cid}")
     public List<Contact> getContacts(@PathVariable("cid") Long id)
     {
         return iContactServices.getContact(id);
     }
}
