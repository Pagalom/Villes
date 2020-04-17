package enumerateur;

public enum Langage {
    Java("JAVA"),
    Python("PYTHON 3.8"),
    C("C"),
    CPlus("C++"),
    PHP("PHP"),
    HTML("HTML");

    String name;

    Langage(String rename){
        this.name = rename;
    }


    @Override
    public String toString() {
        return name;
    }
}