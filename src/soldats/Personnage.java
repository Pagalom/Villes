package soldats;

import soldats.comportement.*;

public class Personnage{

    protected TypeCombat typeCombat = new Pacifiste();
    protected TypeSoin typeSoin = new NoSoin();
    protected TypeDeplacement typeDeplacement = new Marche();

    public Personnage(){}

    public Personnage(TypeCombat tc, TypeSoin ts, TypeDeplacement td){
        this.typeCombat=tc;
        this.typeDeplacement = td;
        this.typeSoin = ts;
    }

    public void seDeplacer(){
        typeDeplacement.deplace();
    }
    public void setDeplacement(TypeDeplacement td){
        this.typeDeplacement = td;
    }

    public void seSoigner(){
        typeSoin.soigne();
    }
    public void setSoin(TypeSoin ts){
        this.typeSoin = ts;
    }

    public void seBattre(){
        typeCombat.combat();
    }
    public void setCombat(TypeCombat tc){
        this.typeCombat = tc;
    }
}