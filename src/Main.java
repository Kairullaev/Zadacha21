import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println();

        try (FileWriter fileWriter = new FileWriter("myFile.txt")) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                String letter = Character.toString(ch);
                fileWriter.write(ch + " " + letter.toLowerCase() + "\n");

            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + "\n");
            }

        } catch (IOException e) {
            System.out.println("it is Exception");
        }
        try (FileReader fileReader = new FileReader("myFile.txt")) {
            Scanner scanner = new Scanner(fileReader);
            int counter = 1;
            while (scanner.hasNext()) {
                System.out.println(counter+": "+scanner.nextLine());
                counter ++;

            }

        } catch (IOException e) {
            System.out.println("It is Excepyion 2");
        }
    }
}