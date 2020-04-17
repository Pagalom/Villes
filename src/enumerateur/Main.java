package enumerateur;

public class Main {
    static public String PARAM1 = "methode 1";
    static public String PARAM2 = "methode 2";

    static public void faire(Langage lang) {
        System.out.println("je code en " + lang);
    }


    public static void main(String[] args) {
        Main.faire(Langage.Java);
        System.out.println(Langage.values()[0]);
    }
}