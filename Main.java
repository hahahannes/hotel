public class Main
{
    public static void main(String[] args)
    {
        // java -cp ../src Main in src 
        Portal portal = new Portal();
        int anzahlHotels = portal.leseDatenbank("Hotels.mupdb");
        System.out.println(anzahlHotels);
        int anzahlBewertungen = portal.leseBewertungen("Bewertungen.txt");
        System.out.println(anzahlBewertungen);
    }
}
