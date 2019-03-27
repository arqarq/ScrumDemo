package pl.sdacacademy.scrumdemo.service;

import org.springframework.stereotype.Service;
import pl.sdacacademy.scrumdemo.model.Contact2;
import pl.sdacacademy.scrumdemo.repositories.Contact2Repository;

@Service
public class Contact2Service {
    private final Contact2Repository contact2Repository;

    Contact2Service(Contact2Repository contact2Repository) {
        this.contact2Repository = contact2Repository;
    }

    public Contact2 save(Contact2 contact2) {
        Contact2 saved = contact2Repository.save(contact2);
        return contact2Repository.findById(saved.getId()).orElseGet(() -> {
            Contact2 contact21 = new Contact2();
            contact21.setEmail("---");
            return contact21;
        });
    }
}
