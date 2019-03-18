package pl.sdacacademy.scrumdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacacademy.scrumdemo.model.Contact;
import pl.sdacacademy.scrumdemo.service.ContactService;

import java.util.List;

@Controller
public class ContactController {
    private final ContactService contactService;

    ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<Contact> getContacts() {
        return contactService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addContact(@RequestBody List<Contact> contacts) {
        if (contacts != null) {
            for (Contact temp : contacts) {
                contactService.save(temp);
            }
        }
    }
}
