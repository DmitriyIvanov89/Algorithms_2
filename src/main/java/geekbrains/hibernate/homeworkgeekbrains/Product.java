package geekbrains.hibernate.homeworkgeekbrains;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Override
    public String toString() {
        return String.format("Product: [id: %d,name: %s,price: %f", id, name, price);
    }
}
