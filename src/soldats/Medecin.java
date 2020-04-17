package soldats;

import soldats.comportement.*;

public class Medecin extends Personnage{
    public Medecin(){
        typeSoin = new Soins();
    }
    public Medecin(TypeCombat tc, TypeSoin ts, TypeDeplacement td) throws TypeCombatMedecinExeption{
        super(tc, ts, td);
        if (!(tc instanceof Pacifiste)){
            throw new TypeCombatMedecinExeption(getClass().getName());
        }
    }
}
