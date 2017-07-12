import java.io.*;
import java.util.Scanner;

/**
 * Created by kuwu on 2017/07/12.
 */
public class CountriesTextFile {


  public static void writeToFile() {
    try {
      Scanner scan = new Scanner(System.in);
      FileWriter writer = new FileWriter("countries.txt", true);
      System.out.println("Enter a Country: ");
      String input = scan.nextLine();
      writer.write("\n" + input );
      System.out.println("This country has been saved!\n");
      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void readFromFile() {
    try {

      File countries = new File("countries.txt");
      FileReader reader = new FileReader(countries);
      BufferedReader buff = new BufferedReader(reader);

      String line = null;

      while ((line = buff.readLine()) != null) {
        System.out.println(line);

      }
      buff.close();
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }





}
