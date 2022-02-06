package geekbrains.hibernate.homeworkgeekbrains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class OrderKey implements Serializable {

    static final Long serialVersionUID = 1L;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "product_id")
    private Long productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderKey orderKey = (OrderKey) o;
        return Objects.equals(personId, orderKey.personId) && Objects.equals(productId, orderKey.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, productId);
    }

    @Override
    public String toString() {
        return String.format("OrderKey : [personId: %d, productId: %d", personId, productId);
    }
}
