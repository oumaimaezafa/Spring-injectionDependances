package ext;

import DAO.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service ");
        Double data = 90.8;
        return data;
    }
}