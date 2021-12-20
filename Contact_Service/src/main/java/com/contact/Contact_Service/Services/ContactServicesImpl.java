package com.contact.Contact_Service.Services;

import com.contact.Contact_Service.Model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServicesImpl implements IContactServices{



    List<Contact> contactList = List.of(
            new Contact(123L,"mohan","rahul@gmail.com",123L),
            new Contact(34L,"radheshyam","vishal@gmail.com",678L),
            new Contact(89L,"riyan","riya@gmail.com",75L)
    );



    @Override
    public List<Contact> getContact(Long id) {
        return this.contactList.stream().filter(contact ->contact.getcId().equals(id)).collect(Collectors.toList());
    }
}
