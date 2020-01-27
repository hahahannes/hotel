import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Portal
{
    private Map<Integer, Hotel> datenbank;

    public Portal() {
         datenbank = new HashMap<>();
    }

    private int byteToInt(byte[] bytes) {
        if (bytes.length != 4) {
            System.out.println("Fehlerhaftes byte-Array");
            System.exit(1);
        }
        return bytes[0] << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | (bytes[3] & 0xFF);
    }

    public int leseDatenbank(String dateiname) {
        try {
            File f = new File( dateiname );
            byte[] buffer = new byte[ (int) f.length() ];
            InputStream in = new FileInputStream( f );
            in.read( buffer );
            in.close();
            int anzahlHotels = buffer[0] << 24;
            System.out.println(anzahlHotels);
            for(int i=1; i<buffer.length; i += 4) {
                int id = this.byteToInt(Arrays.copyOfRange(buffer, i, i+4));
                datenbank.put(id, new Hotel(id));
                System.out.println(id);
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        } catch(IOException exception) {
            System.out.println(exception);
        }

       
        
        return 0;
    }

    public int leseBewertungen(String dateiname) {
        return 0;
    }

    public void bewertungHinzufuegen() {

    }
}
