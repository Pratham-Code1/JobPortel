package com.s2p.jobportel.controller;

import com.s2p.jobportel.dto.ContactDto;
import com.s2p.jobportel.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {


    private IContactService contactService;

    @Autowired
    public ContactController(IContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping(version = "1.0")
    public ResponseEntity<String> saveContact(@RequestBody ContactDto contactDto) {

//        boolean isSave = contactService.saveContact(contactDto);
//        String message=null;
//        if(isSave==true) {
//            message="contact is existed";
//        }
//        else {
//            message="contact does not existed";
//        }
//        return ResponseEntity.status(HttpStatus.CREATED).body(message);

        throw new RuntimeException("Its a Bad Day");
    }

    @GetMapping(path = "/exception1", version = "1.0")
    public String Exception1() throws Exception{
        throw new Exception("Exception is created");

    }

    @GetMapping(path = "/exception2", version = "1.0")
    public String Exception2() {
        throw new RuntimeException("Runtime Exception is created");
    }

    @GetMapping(path = "/exception3", version = "1.0")
    public String Exception3() {
        throw new NullPointerException("NullPointer Exception is created");
    }

}

