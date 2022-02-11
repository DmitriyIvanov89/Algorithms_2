package geekbrains.hibernate.skillbox;

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
    @JoinColumn(name = "person_id")
    private int personId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private int productId;

    @Override
    public String toString() {
        return String.format("Order: {id: %s,person_id: %d,product_id: %d}", orderId, personId, productId);
    }
}
