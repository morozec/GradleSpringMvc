package home.staff2.controllers;

import home.staff2.entities.Person;
import home.staff2.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/bulkcreate")
    public String bulkCreate(){
        personRepository.save(new Person("Rajesh", "Bhojwani"));

        personRepository.saveAll(Arrays.asList(new Person("Salim", "Khan")
                , new Person("Rajesh", "Parihar")
                , new Person("Rahul", "Dravid")
                , new Person("Dharmendra", "Bhojwani")));

        return "Persons are created";
    }

    @GetMapping("/findall")
    public List<Person> findAll(){
        List<Person> persons = personRepository.findAll();
        return persons;
    }


}
