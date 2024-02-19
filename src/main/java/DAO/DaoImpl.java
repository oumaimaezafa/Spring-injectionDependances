package DAO;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Vesrion base de donnee");
        double data=Math.random()*48;
        return data;
    }
}
