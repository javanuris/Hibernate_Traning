package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by User on 04.06.2017.
 */
@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    @Column(name = "first_name" ,nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "middle_name",nullable = false)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name",nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
