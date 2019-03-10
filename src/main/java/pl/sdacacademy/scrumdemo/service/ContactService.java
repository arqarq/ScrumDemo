package pl.sdacacademy.scrumdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacacademy.scrumdemo.model.Contact;
import pl.sdacacademy.scrumdemo.model.ContactRepository;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }
}
