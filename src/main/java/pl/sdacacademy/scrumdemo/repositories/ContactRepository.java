package pl.sdacacademy.scrumdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.sdacacademy.scrumdemo.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
