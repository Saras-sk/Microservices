package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts

    List<Contact> list=List.of(
            new Contact(1L, "sarastk2121@gmail.com", "saras", 1311L ),
            new Contact(2L, "sudhanshutk2121@gmail.com", "sudhanshu", 1312L ),
            new Contact(3L, "gauravtk2121@gmail.com", "gaurav", 1313L ),
            new Contact(4L, "saurabhtk2121@gmail.com", "saurabh", 1314L )


    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
