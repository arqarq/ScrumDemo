package pl.sdacacademy.scrumdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacacademy.scrumdemo.model.Contact;
import pl.sdacacademy.scrumdemo.repositories.ContactRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAll() {
        List<Contact> list = new ArrayList<>();
        Iterable<Contact> allObj = contactRepository.findAll();
        if (allObj != null) {
            list = (List<Contact>) allObj;
        }
        return list;
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }
}
