package geekbrains.hibernate.homeworkgeekbrains;

import lombok.*;
import org.hibernate.annotations.Cascade;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> orders;


    @Override
    public String toString() {
        return String.format("Product: [id: %d, name: %s, price: %f]", id, name, price);
    }
}
