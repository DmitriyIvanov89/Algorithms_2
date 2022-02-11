package geekbrains.hibernate.skillbox;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
public class OrderId implements Serializable {

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "product_id")
    private Long productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderId orderId = (OrderId) o;
        return Objects.equals(personId, orderId.personId) && Objects.equals(productId, orderId.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, productId);
    }

    @Override
    public String toString() {
        return String.format("OrderId:[person_id: %d,product_id: %d]", personId, productId);
    }
}
