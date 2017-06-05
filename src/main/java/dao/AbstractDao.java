package dao;

import dao.interfaces.Dao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import util.HibernateUtil;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by User on 04.06.2017.
 */
public class AbstractDao<T, ID extends Serializable> implements Dao<T, ID> {
    private Class<T> persistentClass;
    private Session session;

    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T findById(ID id) {
        return (T) getSession().load(this.getPersistentClass(), id);
    }

    public List<T> findAll() {
        return this.findByCriteria();
    }

    protected List<T> findByCriteria(Criterion... criterion) {
        Criteria crit = this.getSession().createCriteria(this.getPersistentClass());
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return crit.list();
    }

    public T save(T entity) {
        this.getSession().saveOrUpdate(entity);
        return entity;
    }

    public void delete(T entity) {
      this.getSession().delete(entity);
    }

    public void flush() {
        this.getSession().flush();
    }

    public void clear() {
        this.getSession().clear();
    }

    public void setSession(Session session) {
        this.session = session;
    }

    protected Session getSession() {
        if (this.session == null) {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        return this.session;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }


}
