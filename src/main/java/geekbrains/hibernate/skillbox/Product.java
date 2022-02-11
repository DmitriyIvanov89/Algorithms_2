package geekbrains.hibernate.skillbox;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Order> orders;

    @Override
    public String toString() {
        return String.format("Product: {id: %d,name: %s,price: %f}", id, name, price);
    }
}
