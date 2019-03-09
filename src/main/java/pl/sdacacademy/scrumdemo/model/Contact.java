package pl.sdacacademy.scrum.ScrumDemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.Table;

//@Entity
//@Table(name = "person")
@Data
public class Contact {
    @Id
    Long id;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;


}
