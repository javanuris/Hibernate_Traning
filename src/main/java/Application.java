import dao.AuthorHibernateDao;
import dao.BookHibernateDao;
import dao.GenreHibernateDao;
import dao.interfaces.AuthorDao;
import dao.interfaces.BookDao;
import dao.interfaces.GenreDao;
import entities.Author;
import entities.Book;
import entities.Genre;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 31.05.2017.
 */
public class Application {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Book book = new Book();

        AuthorDao authorDao = new AuthorHibernateDao();
        authorDao.setSession(session);


    /*    book.setName("1984");
        book.setDescription("It was ling time ago");
        book.setYear(new Date());
        book.setIsbn("1236547899");
        book.setAuthor(author);

        GenreDao genreDao = new GenreHibernateDao();
        genreDao.setSession(session);
        Genre genre = genreDao.findById(1);

        book.setGenre(genre);

        BookDao bookDao = new BookHibernateDao();
        bookDao.setSession(session);*/
        List<Author> authors = authorDao.findByFirstName("Nuris");
        System.out.println(authors.size());

        session.getTransaction().commit();
        session.close();
    }

}
