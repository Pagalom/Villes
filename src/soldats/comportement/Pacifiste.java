package soldats.comportement;

public class Pacifiste implements TypeCombat{
    @Override
    public void combat() {
        System.out.println("je ne combat pas");
    }
}