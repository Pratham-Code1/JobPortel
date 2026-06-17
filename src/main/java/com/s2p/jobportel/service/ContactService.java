package com.s2p.jobportel.service;

import com.s2p.jobportel.dto.ContactDto;
import com.s2p.jobportel.entity.Contact;
import com.s2p.jobportel.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ContactService implements IContactService{

    private ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public  boolean saveContact(ContactDto contactDto){

        Contact contact = mapToEntity(contactDto);
        Contact savedContact = contactRepository.save(contact);

        if(null!=contactDto)
        {
            return true;
        }
            return false;
    }

    private ContactDto mapToDto(Contact contact) {
        ContactDto contactDto = new ContactDto();

        String name = contact.getName();
        contactDto.setName(name);

        String email = contact.getEmail();
        contactDto.setEmail(email);

        String message = contact.getMessage();
        contactDto.setMessage(message);

        String subject = contact.getSubject();
        contactDto.setSubject(subject);

        String usertype = contact.getUserType();
        contactDto.setUserType(usertype);

        return contactDto;
    }

    private Contact mapToEntity(ContactDto contactDto){

        Contact contact = new Contact();

        String name = contactDto.getName();
        contact.setName(name);

        String email = contactDto.getEmail();
        contact.setEmail(email);

        String message = contactDto.getMessage();
        contact.setMessage(message);

        String subject = contactDto.getSubject();
        contact.setSubject(subject);

        String usertype = contactDto.getUserType();
        contact.setUserType(usertype);

        contact.setCreatedAt(Instant.now());
        contact.setCreatedBy("SYSTEM");
        contact.setStatus("NEW");

        return contact;

    }

}
