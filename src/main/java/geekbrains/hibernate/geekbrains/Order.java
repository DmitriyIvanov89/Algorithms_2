package geekbrains.hibernate.geekbrains;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "person_product")
@Data
@NoArgsConstructor
public class Order {

    @EmbeddedId
    private OrderId orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @Column(name = "price")
    private Double price;

    @Override
    public String toString() {
        return String.format("Order: {id: %s,person_id: %d,product_id: %d,price: %f}", orderId, orderId.getPersonId(), orderId.getProductId(), price);
    }
}
