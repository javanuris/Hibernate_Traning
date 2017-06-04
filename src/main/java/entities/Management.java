package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "management")
@AttributeOverride(name = "id", column = @Column(name = "id_management"))
public class Management extends BaseEntity {
    private Date returnDate;
    private Transaction transaction;

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @OneToOne
    @JoinColumn(name = "id_transaction",foreignKey = @ForeignKey(name = "fk_transaction") ,nullable = false)
    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
