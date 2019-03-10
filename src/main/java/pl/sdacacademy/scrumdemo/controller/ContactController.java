package pl.sdacacademy.scrumdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.sdacacademy.scrumdemo.model.Contact;
import pl.sdacacademy.scrumdemo.service.ContactService;

@Controller
public class ContactController {
    private final ContactService contactService;

    @Autowired
    ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addContact(@RequestBody Contact contact) {
        contactService.save(contact);
    }
}
