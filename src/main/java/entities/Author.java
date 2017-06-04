package entities;

import javax.persistence.*;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "author")
@AttributeOverride(name = "id", column = @Column(name = "id_author"))
public class Author extends BaseEntity {
    private Name name;

    @Embedded
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
