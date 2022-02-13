package geekbrains.hibernate.lesson_2;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "val")
    private int val;

    @Version
    private Long version;

    @Override
    public String toString() {
        return String.format("Item: {id: %d, value: %d, version: %d}", id, val, version);
    }
}
