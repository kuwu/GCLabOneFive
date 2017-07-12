import java.io.*;
import java.util.Scanner;

/**
 * Created by kuwu on 2017/07/11.
 */
public class CountriesApp {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Countries Maintenance Application\n");

    int menuNum;

    do {
      System.out.println("1 - See the list of countries\n" + "2 - Add a country\n" + "3 - Exit\n");
      System.out.print("Enter menu number: ");
      menuNum = scan.nextInt();

      if (menuNum == 1) {
        readFromFile();
      } else if (menuNum == 2) {
        writeToFile(scan);
      } else if (menuNum == 3) {
        System.out.println("Bye-B");
      } else {
        System.out.println("Invalid entry");
      }
    } while (menuNum != 3);
  }

  private static void writeToFile(Scanner scan) {
    try {
      FileWriter writer = new FileWriter("countries.txt");
      System.out.println("Enter a Country: ");
      while (true) {
        String input = scan.nextLine();
        if ("done".equalsIgnoreCase(input.trim())) {
          break;
        }
        writer.write(input + "\n");

      }
      System.out.println("This country has been saved!\n");

      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void readFromFile() {
    try {

      File countries = new File("countries.txt");
      FileReader reader = new FileReader(countries);
      BufferedReader buff = new BufferedReader(reader);

      String line = null;

      while ((line = buff.readLine()) != null) {
        System.out.println(line);
      }

      buff.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

//TODO add validation