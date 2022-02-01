package geekbrains.hibernate.homework;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @ManyToMany(mappedBy = "persons")
    private List<Person> personList;

    @Override
    public String toString() {
        return String.format("Product: [id: %d, name: %s, price: %f]", id, name, price);
    }
}
