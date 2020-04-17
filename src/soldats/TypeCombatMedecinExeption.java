package soldats;

public class TypeCombatMedecinExeption extends Exception{
    public TypeCombatMedecinExeption(String e) {
        System.out.println(e + " ne peut utiliser cette arme");
    }
}
