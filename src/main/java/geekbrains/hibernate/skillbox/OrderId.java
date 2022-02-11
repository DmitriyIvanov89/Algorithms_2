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
    private int personId;

    @Column(name = "product_id")
    private int productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderId orderId = (OrderId) o;
        return personId == orderId.personId && productId == orderId.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, productId);
    }
}
