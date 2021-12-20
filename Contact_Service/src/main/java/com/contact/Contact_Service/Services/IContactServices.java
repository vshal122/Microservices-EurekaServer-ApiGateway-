package com.contact.Contact_Service.Services;

import com.contact.Contact_Service.Model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IContactServices {

    public List<Contact> getContact(Long id);
}
