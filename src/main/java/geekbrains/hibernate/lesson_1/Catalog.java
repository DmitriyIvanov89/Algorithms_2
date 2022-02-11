package geekbrains.hibernate.lesson_1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "catalogs")
@Getter
@Setter
@NoArgsConstructor
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    public Catalog(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Catalog: " + id + " " + title;
    }
}
