package soldats;

import soldats.comportement.*;

public class Soldat extends Personnage{
    public Soldat(){
        typeCombat = new Pistolet();
        typeSoin = new PremiersSoins();
    }
    public Soldat(TypeCombat tc, TypeSoin ts, TypeDeplacement td) {
        super(tc, ts, td);
    }
}

//nom variable : cbt = new Sniper();