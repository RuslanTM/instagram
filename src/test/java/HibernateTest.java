import kz.instagram.dao.AbstractDaoImpl;
import kz.instagram.model.Person;

public class HibernateTest {

    public static void main(String[] args) {
        AbstractDaoImpl dao = new AbstractDaoImpl(Person.class);
        dao.findAll();
    }
}
