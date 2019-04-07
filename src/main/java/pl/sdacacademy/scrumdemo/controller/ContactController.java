package pl.sdacacademy.scrumdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacacademy.scrumdemo.ScrumDemoApplication;
import pl.sdacacademy.scrumdemo.model.Contact;
import pl.sdacacademy.scrumdemo.model.Contact2;
import pl.sdacacademy.scrumdemo.service.Contact2Service;
import pl.sdacacademy.scrumdemo.service.ContactService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ContactController {
    private static final Logger LOG = Logger.getLogger(ScrumDemoApplication.class.getName());
    private final ContactService contactService;
    private final Contact2Service contact2Service;

    ContactController(ContactService contactService,
                      Contact2Service contact2Service) {
        this.contactService = contactService;
        this.contact2Service = contact2Service;
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

    @PostMapping("/new_account")
    public ResponseEntity<Contact2> addAccount(@RequestBody Contact2 contact2s) {
        LOG.log(Level.INFO, "Przyszło: " + contact2s.getEmail());
        Long l = (contact2s.getId() != null) ? contact2s.getId() : 88888;
        LOG.log(Level.INFO, l.toString());
        Contact2 saved = contact2Service.save(contact2s);
        LOG.log(Level.INFO, saved.getId().toString());
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }
}
