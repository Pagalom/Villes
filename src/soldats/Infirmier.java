package soldats;

import soldats.comportement.*;

public class Infirmier extends Personnage{
    public Infirmier(){
        typeSoin = new PremiersSoins();
        typeCombat = new Pistolet();
    }
    public Infirmier(TypeCombat tc, TypeSoin ts, TypeDeplacement td){
        super(tc, ts, td);
    }
}
