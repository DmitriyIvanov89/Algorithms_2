package geekbrains.hibernate.skillbox;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person_product")
@Data
@NoArgsConstructor
public class Order {
    private int id;
    private int person_id;
    private int product_id;
}
