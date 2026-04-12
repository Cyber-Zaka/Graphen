

/**
 * Beschreiben Sie hier die Klasse Schulgraph.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schulgraph
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Graph g;
    private double[][] admatrix;

    /**
     * Konstruktor für Objekte der Klasse Schulgraph
     */
    public Schulgraph()
    {
        // Aufbau des Schulgraphen
        g = new Graph();

        //alle Kanten und Knoten werden deklariert und initialisiert
        Vertex TorRk = new Vertex("Tor Rk");
        Vertex LZ = new Vertex("LZ");
        Vertex Sekretariat = new Vertex("Sekretariat");
        Vertex PZ = new Vertex("PZ");
        Vertex Radkeller = new Vertex("Radkeller");
        Vertex Mensa = new Vertex("Mensa");
        Vertex Cafeteria = new Vertex("Cafeteria");
        Vertex WC = new Vertex("WC");
        Vertex Aula = new Vertex("Aula");
        Vertex Kunstraum = new Vertex("Kunstraum");
        Vertex Inforaum = new Vertex("Inforaum");
        Vertex Musikraum = new Vertex("Musikraum");
        Vertex Inforaum1029 = new Vertex("Inforaum -1029");
        Vertex Sporthalle = new Vertex("Sporthalle");
        Vertex Tischtennisplatten = new Vertex("Tischtennisplatten");
        Vertex TorSF = new Vertex("Tor SF");
        Vertex Fußballplatz = new Vertex("Fußballplatz");
        Vertex Schulzoo = new Vertex("Schulzoo");
        Vertex Bioraum = new Vertex("Bioraum");
        Vertex Chemieraum = new Vertex("Chemieraum");
        Vertex NWTreppenhaus = new Vertex("NW Treppenhaus");



        //die Knoten und Kanten werden dem Graphen hinzugefügt
        g.addVertex(TorRk);
        g.addVertex(LZ);
        g.addVertex(Sekretariat);
        g.addVertex(PZ);
        g.addVertex(Radkeller);
        g.addVertex(Mensa);
        g.addVertex(Cafeteria);
        g.addVertex(WC);
        g.addVertex(Aula);
        g.addVertex(Kunstraum);
        g.addVertex(Inforaum);
        g.addVertex(Musikraum);
        g.addVertex(Inforaum1029);
        g.addVertex(Sporthalle);
        g.addVertex(Tischtennisplatten);
        g.addVertex(TorSF);
        g.addVertex(Fußballplatz);
        g.addVertex(Schulzoo);
        g.addVertex(Bioraum);
        g.addVertex(Chemieraum);
        g.addVertex(NWTreppenhaus);

        g.addEdge(new Edge(Mensa, LZ, 96));
        g.addEdge(new Edge(Mensa, Cafeteria, 7));
        g.addEdge(new Edge(Mensa, WC, 22));
        g.addEdge(new Edge(WC, Cafeteria, 22));
        g.addEdge(new Edge(Cafeteria, Aula, 7));
        g.addEdge(new Edge(Aula, WC, 15));
        g.addEdge(new Edge(Cafeteria, Kunstraum, 90));
        g.addEdge(new Edge(Kunstraum, Aula, 71));
        g.addEdge(new Edge(Kunstraum, Musikraum, 9));
        g.addEdge(new Edge(Kunstraum, Inforaum1029, 50));
        g.addEdge(new Edge(Kunstraum, Inforaum, 64));
        g.addEdge(new Edge(Musikraum, Inforaum1029, 55));
        g.addEdge(new Edge(Musikraum, Inforaum, 50));
        g.addEdge(new Edge(Inforaum, Inforaum1029, 5));
        g.addEdge(new Edge(Kunstraum, Inforaum1029, 50));
        g.addEdge(new Edge(Aula, Inforaum, 95));
        g.addEdge(new Edge(WC, Inforaum, 80));
        g.addEdge(new Edge(Inforaum, PZ, 96));
        g.addEdge(new Edge(PZ, TorRk, 98));
        g.addEdge(new Edge(PZ, Radkeller, 45));
        g.addEdge(new Edge(PZ, LZ, 37));
        g.addEdge(new Edge(PZ, Sekretariat, 37));
        g.addEdge(new Edge(TorRk, LZ, 79));
        g.addEdge(new Edge(TorRk, Sekretariat, 78));
        g.addEdge(new Edge(LZ, Sekretariat, 18));
        g.addEdge(new Edge(LZ, Radkeller, 27));
        g.addEdge(new Edge(Sekretariat, Radkeller, 26));
        g.addEdge(new Edge(Inforaum, Sporthalle, 95));
        g.addEdge(new Edge(Inforaum, Fußballplatz, 34));
        g.addEdge(new Edge(Sporthalle, Fußballplatz, 58));
        g.addEdge(new Edge(Sporthalle, Tischtennisplatten, 28));
        g.addEdge(new Edge(Sporthalle, TorSF, 63));
        g.addEdge(new Edge(Fußballplatz, Tischtennisplatten, 57));
        g.addEdge(new Edge(Fußballplatz, TorSF, 34));
        g.addEdge(new Edge(Tischtennisplatten, TorSF, 8));
        g.addEdge(new Edge(Inforaum, Schulzoo, 17));
        g.addEdge(new Edge(Inforaum, NWTreppenhaus, 13));
        g.addEdge(new Edge(Schulzoo, Chemieraum, 7));
        g.addEdge(new Edge(Chemieraum, NWTreppenhaus, 22));
        g.addEdge(new Edge(NWTreppenhaus, Bioraum, 21));
        g.addEdge(new Edge(Chemieraum, Bioraum, 4));
        g.addEdge(new Edge(Schulzoo, Bioraum, 7));


       // adListe();
    }

    /**
     * Die Anfrage gibt die ID aller Knoten auf der Konsole aus.
     */
    public void knotenAnzeigen() {
        //dein Quellcode hier
        List<Vertex> alleKnoten = g.getVertices();
        alleKnoten.toFirst();
        if (alleKnoten.hasAccess())
            while (alleKnoten.hasAccess()) {
            System.out.println(alleKnoten.getContent().getID());
            alleKnoten.next();
        }
    }


    /**
     * man erstellt eine Liste mit allen Knoten und durchläuft diese - hierbei werden vom jeden einzelnen
     * Knoten die Verbindungen mit anderen Knoten ausgegeben und ebenso das Gewicht der Kanten
     */
    public void adListe(){
        //dein Quellcode hier
        List<Vertex> alleKnoten = g.getVertices();
        alleKnoten.toFirst();

        if (alleKnoten.hasAccess())
            while (alleKnoten.hasAccess()) {
                Vertex aktuellerKnoten = alleKnoten.getContent();
                List<Edge> kanten = g.getEdges(alleKnoten.getContent());
                kanten.toFirst();
                while(kanten.hasAccess()) {
                    Vertex[] X;
                    X = kanten.getContent().getVertices();
                    if (X[0].getID().equals(aktuellerKnoten.getID())) {
                        System.out.println(aktuellerKnoten.getID() + " ist mit " + X[1].getID() + " verbunden, Gewicht: " + kanten.getContent().getWeight());
                    } else {
                        System.out.println(aktuellerKnoten.getID() + " ist mit " + X[0].getID() + " verbunden, Gewicht: " + kanten.getContent().getWeight());
                    }
                    kanten.next();
                }

                  alleKnoten.next();
            }
    }

    /**
     * Alle direkt verbundenen Knoten des übergebenen Knoten sollen ausgegeben werden.
     * @param pVertex
     */

    public void kantenAnzeigen(String pVertex){
        //dein Quellcode hier
        List<Vertex> alleKnoten = g.getVertices();
        alleKnoten.toFirst();
        while (alleKnoten.hasAccess()) {
            Vertex aktuellerKnoten = alleKnoten.getContent();
            if(aktuellerKnoten.getID().equals(pVertex)){
                List<Edge> kanten = g.getEdges(alleKnoten.getContent());
                kanten.toFirst();
                while(kanten.hasAccess()) {
                    Vertex[] X;
                    X = kanten.getContent().getVertices();
                    if (X[0].getID().equals(aktuellerKnoten.getID())) {
                        System.out.println(aktuellerKnoten.getID() + " ist mit " + X[1].getID() + " verbunden, Gewicht: " + kanten.getContent().getWeight());
                    } else {
                        System.out.println(aktuellerKnoten.getID() + " ist mit " + X[0].getID() + " verbunden, Gewicht: " + kanten.getContent().getWeight());
                    }
                    kanten.next();
                }

                alleKnoten.next();
            }
            else{
                alleKnoten.next();
            }
        }
    }

    /**
     * Die Anzahl aller Knoten im Graph wird zurückgegeben und gleichzeitig auf der konsole ausgegeben.
     * @return anzahl : int
     */
    public int zaehleKnoten()
    {
        List<Edge> kanten = g.getEdges();
        int anzahl = 0;
        while(kanten.hasAccess()){
            anzahl++;
            kanten.next();
        }
        //dein Quellcode hier
        System.out.println(anzahl);
        return anzahl;
    }

    /**
     * Die Anfrage liefert den Graph als Adjazenzmatrix in Form eines zweidimensionalen Arrays zurück
     *
     * @return admatrix : [][]double
     */

    public double[][] admatrixRueckgabe()
    {
        //dein Quellcode hier
        return admatrix;
    }

    /**
     * Breitensuche: Weitere Informationen zur Breitensuche findest du im Buch! Der Parameter gibt den Startknoten an
     * @param pStart : String
     * @return Ergebnisliste der Breitensuche
     */
    public List<Vertex> breitensuche(String pStart)
    {
        Vertex gesuchterKnoten = g.getVertex(pStart);
        return breitensucheIntern(gesuchterKnoten);
    }

    /**
     * Interne Methode zur rekursiven Breitensuche.
     */
    private List<Vertex> breitensucheIntern(Vertex pStart) {
        // dein Quellcode hier
        List<Vertex> ergebnisListe = new List<>();
        return ergebnisListe;
    }

    /**
     * Tiefensuche: Weitere Informationen zur Tiefensuche findest du im Buch! Der Parameter gibt den Startknoten an
     * @param pStart : String
     * @return Ergebnisliste der Breitensuche
     */
    public List<Vertex> tiefendurchlauf(String pStart)
    {
        Vertex gesuchterKnoten = g.getVertex(pStart);
        return tiefendurchlaufIntern(gesuchterKnoten);
    }

    /**
     * Interne Methode zur rekursiven Tiefensuche.
     */
    private List<Vertex> tiefendurchlaufIntern(Vertex pStart) {
        //Dein Quellcode hier
        List<Vertex> ergebnisListe = new List<>();
        return ergebnisListe;
    }
}
