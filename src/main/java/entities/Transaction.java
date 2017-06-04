package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "transaction")
@AttributeOverride(name = "id", column = @Column(name = "id_transaction"))
public class Transaction extends BaseEntity {
    private Date startDate;
    private Date endDate;
    private BookInfo bookInfo;
    private Customer customer;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date" , nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @ManyToOne
    @JoinColumn(name = "id_book_info", foreignKey = @ForeignKey(name = "fk_book_info"),nullable = false)
    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    @ManyToOne
    @JoinColumn(name = "id_customer", foreignKey = @ForeignKey(name = "fk_customer"),nullable = false)
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
