package metier;

import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    //@Autowired
    private IDao iDao;
    /*
     couplage faible : cad prete fonctionner a n'importe quelle classe qui implemente cette interface
     eviter d'utiliser new pour ne tombe pas  au couplage forte
     apres on peut affecter soit la version 1 ou bien 2
     */
    public IMetierImpl(IDao iDao) {
        this.iDao = iDao;
    }
    @Override
    public double calcul() {
        double data= iDao.getData();
        double res=data*11.4/Math.cos(data);
        return res;
    }
    /*
     Injecter dans la variable dao un objet
      d'une classe qui implemente l'interface IDAO

     */

    //moyenne qui me permet d'affecter a un varible une valeur
    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }
}
