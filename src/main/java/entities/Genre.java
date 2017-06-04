package entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "genre")
@AttributeOverride(name = "id", column = @Column(name = "id_genre"))
public class Genre extends BaseEntity {
    private String name;

    @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
