package pl.sdacacademy.scrum.ScrumDemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Contact {
    @Id
    Long id;
    String firsName;
    String lastName;
    String phoneNumber;
    String email;


}
