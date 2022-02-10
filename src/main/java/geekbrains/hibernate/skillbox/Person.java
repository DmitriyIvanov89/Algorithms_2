package geekbrains.hibernate.skillbox;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Person: [id: %d, name: %s]", id, name);
    }
}
