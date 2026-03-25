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
        Barlas.adListe();
    }
}