import org.hibernate.Session;
import util.HibernateUtil;


/**
 * Created by User on 31.05.2017.
 */
public class Application {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        //session.save();
        session.getTransaction().commit();
        session.close();
    }

}
