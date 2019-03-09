package pl.sdacacademy.scrum.ScrumDemo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public void save (Contact contact) {
        repository.save(contact);
    }

}
