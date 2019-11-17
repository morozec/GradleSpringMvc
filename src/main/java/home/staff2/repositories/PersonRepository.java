package home.staff2.repositories;

import home.staff2.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

//    List<Person> findByFirstName(String FirstName);
//    List<Person> findAll();
}

