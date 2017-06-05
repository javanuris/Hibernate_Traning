package dao.interfaces;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by User on 04.06.2017.
 */
public interface Dao<T, ID> {
    T findById(ID id);

    List<T> findAll();

    T save(T entity);

    void delete(T entity);

    void flush();

    void clear();

    void setSession(Session session);
}
