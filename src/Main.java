//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Schulgraph Barlas;
    public static void main(String[] args) {
        Main m = new Main();
    }
    Main(){
        Barlas= new Schulgraph();
        Barlas.knotenAnzeigen();
        System.out.println("____________________________________________________________________________________________________________");
        Barlas.adListe();
        System.out.println("____________________________________________________________________________________________________________");
        Barlas.kantenAnzeigen("Sporthalle");
        System.out.println("____________________________________________________________________________________________________________");
        Barlas.zaehleKnoten();
        System.out.println("____________________________________________________________________________________________________________");

        System.out.println("____________________________________________________________________________________________________________");

        System.out.println("____________________________________________________________________________________________________________");
    }
}