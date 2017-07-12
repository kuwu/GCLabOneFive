import java.io.*;
import java.util.Scanner;

/**
 * This is a simple program to demo for creating, reading and
 * writing to a txt file.
 * Created by kuwu on 2017/07/11.
 */
public class CountriesApp {
  

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Countries Maintenance Application\n");

    CountriesTextFile countryText = new CountriesTextFile();


    countries(scan, countryText);


  }

  private static void countries(Scanner scan, CountriesTextFile countryText) {


    int menuNum = 0;
    // loop for countries - read, wrte and exit
    do {
      System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit\n");
      System.out.print("Enter menu number: ");
      menuNum = scan.nextInt();

      if (menuNum == 1) {
        countryText.readFromFile();
      } else if (menuNum == 2) {
        countryText.writeToFile();
      } else if (menuNum == 3) {
        System.out.println("Bye-B");
      } else {
        System.out.println("Invalid entry");
      }
    } while (menuNum != 3);

    menuNum = validNum(scan, menuNum);

  }

  // input check
  private static int validNum(Scanner scan, int menuNum) {
    while (menuNum != 1 && menuNum != 2 && menuNum != 3) {
      System.out.println("Try again, invalid input");
      System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit\n");
      System.out.println("\nEnter menu number");
      menuNum = scan.nextInt();
    }
    return menuNum;

  }

}


