package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 04.06.2017.
 */
@Entity
@Table(name = "book")
@AttributeOverride(name = "id", column = @Column(name = "id_book"))
public class Book extends BaseEntity {

    private String description;
    private String isbn;
    private String name;
    private Date year;
    private Author author;
    private Genre genre;

    @Column(name = "description",nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "isbn",nullable = false)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Column(name = "name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "year",nullable = false)
    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @OneToOne
    @JoinColumn(name = "id_author",foreignKey = @ForeignKey(name = "fk_author") ,nullable = false)
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @ManyToOne
    @JoinColumn(name = "id_genre", foreignKey = @ForeignKey(name = "fk_genre"),nullable = false)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
