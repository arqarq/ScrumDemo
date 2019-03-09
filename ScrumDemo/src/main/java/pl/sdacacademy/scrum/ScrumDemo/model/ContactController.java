package pl.sdacacademy.scrum.ScrumDemo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addContact (@RequestBody Contact contact) {
        service.save(contact);
    }

}
