import java.util.ArrayList;
import java.util.List;

public class Hotel
{
    private int ID;
    List<Bewertung> bewertungen;

    public Hotel(int ID) {
        this.ID = ID;
        this.bewertungen = new ArrayList<>();
    }

    public void bewertungHinzufuegen(Bewertung bewertung) {
        bewertungen.add(bewertung);
    }
}
