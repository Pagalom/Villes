package soldats.comportement;

public class Voiture implements TypeDeplacement {
    @Override
    public void deplace() {
        System.out.println("Je me déplace en voiture");
    }
}
