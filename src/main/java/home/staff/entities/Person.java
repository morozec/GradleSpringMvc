package home.staff.entities;



import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
