package entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "city")
@AttributeOverride(name = "id", column = @Column(name = "id_city"))
public class City extends BaseEntity {
    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
