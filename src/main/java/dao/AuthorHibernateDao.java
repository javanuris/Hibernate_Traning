package dao;

import dao.interfaces.AuthorDao;
import entities.Author;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by User on 04.06.2017.
 */
public class AuthorHibernateDao extends AbstractDao<Author , Integer> implements AuthorDao{
    public List<Author> findByFirstName(String firstName) {
        Query query = getSession().createQuery("select a from Author a where a.name.firstName like :firstName").setParameter("firstName", firstName);
        return query.list();
    }
}
