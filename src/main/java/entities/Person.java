package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "person")
@AttributeOverride(name = "id", column = @Column(name = "id_person"))
public class Person extends BaseEntity {

    private Name name;
    private String phone;
    private Date birthday;
    private String address;
    private City city;

    @Embedded
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birthday",nullable = false)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "address",nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToOne
    @JoinColumn(name = "id_city", foreignKey = @ForeignKey(name = "fk_city"),nullable = false)
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
