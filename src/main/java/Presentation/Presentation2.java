package Presentation;

import DAO.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
       // 2- par instanciation dynamique
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cdao=Class.forName(daoClassName);
        IDao dao= (IDao) cdao.newInstance();
        System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.newInstance();

        Method method =cMetier.getMethod("setiDao",IDao.class);
       //metier.setDao(dao)
        method.invoke(metier,dao);// executer la methode avec invoke
        System.out.println("Resultat => "+ metier.calcul());

    }
}
   /*   les types des exceptions :
        InstantiationException : si on n 'a pas de constrecteur par defaut
        IllegalAcceessException : Si on a un constrecteur mais il est privee
        ClassCastException : si on fait l'appel d'une classe ms il n'herite pas de interface IDAO

    */