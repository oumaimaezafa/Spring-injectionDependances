package Presentation;

import DAO.DaoImpl;
import DAO.IDao;
import metier.IMetierImpl;
// Cette classe represnete dans l'instanciation statique une FABRIQUE OU UNE FACTORY
public class Presentation {
    /*
    INJECTION DES DEPENDANCES AVEC INJECTION STATIQUE
     =>  avec new  donc  c'est un couplage forte
     */
    public static void main(String[] args) {
        IDao idao=new DaoImpl();
        IMetierImpl metier=new IMetierImpl(idao);
        //injection des dependances avec les setters
        metier.setiDao(idao);
        System.out.println("res: "+metier.calcul());

    }
}
