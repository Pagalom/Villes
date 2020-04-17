package soldats;

import soldats.comportement.*;

class Main{
    public static void main(String[] args) {
        Personnage[] tPers = {new Soldat(), new Confine(), new Medecin()};

        for(int i = 0; i < tPers.length; i++){
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
            tPers[i].seBattre();
            tPers[i].seDeplacer();
            tPers[i].seSoigner();
        }

        try {
            Medecin Jack = new Medecin(new Sniper(), new Soins(), new Course());
        } catch (TypeCombatMedecinExeption typeCombatMedecinExeption) {
            typeCombatMedecinExeption.printStackTrace();
        }


    }
}