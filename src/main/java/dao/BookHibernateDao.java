package dao;

import dao.interfaces.BookDao;
import entities.Book;

/**
 * Created by User on 04.06.2017.
 */
public class BookHibernateDao extends AbstractDao<Book, Integer> implements BookDao{
}
