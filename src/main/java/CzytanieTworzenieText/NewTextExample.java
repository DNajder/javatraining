package CzytanieTworzenieText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewTextExample {
    public static void main(String[] args) throws IOException {
// trows i "nazwa Błędu" dodaja sie żeby ostrzec ze w pdanej metodzie może wystąpić bład.

        String fileName = "plik.txt";
        FileWriter fileWriter = null;


        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst1\n");//\n musi byc dodane apy przeszło do nowej linji
            fileWriter.write("Tekst2\n");
            fileWriter.write("Tekst3\n");
            fileWriter.write("Tekst4\n");
            fileWriter.write("Tekst5\n");
        } catch (IOException e) {
            System.out.println("Problem z dostępem do pliku");
        } finally {
            if (fileWriter == null) {
                System.out.println("Plik pusty");
            } else {
                fileWriter.close();
            }
        }
        BufferedReader bufferedReader =null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                linia = bufferedReader.readLine();
                if (linia!=null) {
                    System.out.println(linia);
                }
            }while (linia!=null);
        } catch (Exception e) {
            System.out.println("Brak pliku , lub dostępu do pliku");
        }finally {
            if (bufferedReader ==null){
                System.out.println("Plik pusy");
            }else {
                bufferedReader.close();
            }

        }

    }
}
