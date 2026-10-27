import java.io.*;
import java.util.ArrayList;

public class Serializar {

    public static ArrayList getLista() {
        ArrayList xogadores = new ArrayList<String>();
        File file = new File("mod.txt");
        if (file.exists()) {

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    // System.out.println(line);
                    xogadores.add(line);
                }


            } catch (IOException e) {
                System.out.println("Erro lendo algo " + e.getMessage());
            }
        }
         //System.out.println(xogadores);
        return xogadores;

    }
}
