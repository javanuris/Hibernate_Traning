package dao.interfaces;

import entities.Author;

import java.util.List;

/**
 * Created by User on 04.06.2017.
 */
public interface AuthorDao extends Dao<Author , Integer>{
     List<Author> findByFirstName(String firstName);
}
