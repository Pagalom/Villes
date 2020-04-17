package soldats.comportement;

public class NoSoin implements TypeSoin{
    @Override
    public void soigne() {
        System.out.println("je ne soigne pas");
    }
}
