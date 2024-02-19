package ext;

import DAO.IDao;
import org.springframework.stereotype.Component;
@Component("daov2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur");
        Double data=40.8;
        return data;
    }
}
