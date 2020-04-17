package soldats.comportement;

public class Marche implements TypeDeplacement{
    @Override
    public void deplace() {
        System.out.println("Je me déplace à pied");
    }
}
