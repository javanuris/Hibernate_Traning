package entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "customer")
@AttributeOverride(name = "id", column = @Column(name = "id_customer"))
public class Customer extends BaseEntity {

    private Date registerDate;
    private String password;
    private String email;
    private Person person;
    private Role role;
    private Set<Transaction> transactions;

    @Column(name = "register_date",nullable = false)
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email",nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToOne
    @JoinColumn(name = "id_person",foreignKey = @ForeignKey(name = "fk_person"),nullable = false)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    @JoinColumn(name = "id_role", foreignKey = @ForeignKey(name = "fk_role"),nullable = false)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade=CascadeType.ALL)
    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
