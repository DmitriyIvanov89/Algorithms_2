package geekbrains.hibernate.homeworkgeekbrains;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "person_product")
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @EmbeddedId
    private OrderKey orderKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @Column(name = "price")
    private Double price;

}
