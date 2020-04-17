package soldats;

import soldats.comportement.TypeCombat;
import soldats.comportement.TypeDeplacement;
import soldats.comportement.TypeSoin;

public class Confine extends Personnage{
    public Confine(){

    }
    public Confine(TypeCombat tc, TypeSoin ts, TypeDeplacement td){
        super(tc, ts, td);
    }
}
