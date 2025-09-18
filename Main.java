// 1. IMPORT Scanner Class
import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("Welcome to MadLibs");

      // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter:");
      String player = input.nextLine();
      System.out.println("Welcome," + player);

      // Create variables for each placeholder word
      String person = "dog";
      String noun = "shower";
      String looks = "look-chopped";
      String emotion = "upset";
      String item = "wallet";
      String emotions = "frivilous";

      System.out.println("Today is a very important day because my " + person + " is getting a " + noun);
      System.out.println("If he gets a bad haircut it will make him " + looks);
      System.out.println("My dad is also very" + emotion + " because he lost his " + item );
      System.out.println("I woke up feeling very" + emotions);
   }
}
