package entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "book_info")
@AttributeOverride(name = "id", column = @Column(name = "id_book_info"))
public class BookInfo extends BaseEntity {

    private Integer amount;
    private Integer price;
    private Book book;
    private Set<Transaction> transactions;

    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @OneToOne
    @JoinColumn(name = "id_book",foreignKey = @ForeignKey(name = "fk_book"))
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bookInfo", cascade=CascadeType.ALL)
    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
