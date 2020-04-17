package soldats;

import soldats.comportement.*;

public class TireurElite extends Personnage{

    public TireurElite(){
        typeCombat= new Sniper();
        typeDeplacement = new Rampe();
    }
    public TireurElite(TypeCombat tc, TypeSoin ts, TypeDeplacement td){
        super(tc, ts, td);
    }
}
