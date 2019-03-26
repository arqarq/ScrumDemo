package pl.sdacacademy.scrumdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacacademy.scrumdemo.ScrumDemoApplication;
import pl.sdacacademy.scrumdemo.model.Contact;
import pl.sdacacademy.scrumdemo.model.Contact2;
import pl.sdacacademy.scrumdemo.service.ContactService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ContactController {
    private static final Logger LOG = Logger.getLogger(ScrumDemoApplication.class.getName());
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

    @PostMapping("/accounts")
    public Contact2 addAccount(@RequestBody Contact2 contact2s) {
        LOG.log(Level.INFO, "Przyszło: " + contact2s.getEmail());
        return contact2s;
    }
}
