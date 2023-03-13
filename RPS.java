import java.lang.Thread.State;
import java.util.Scanner;
import java.util.function.Function;

import javafx.print.Paper;

import java.util.Random;

//Implemtent Ignore case funcinality
public class RPS {
  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    final String PLAY_OPTION = "Play";
    final String HELP_OPTION = "Help";
    final String LEAVE_OPTION = "Leave";
    System.out.println(" === Rock<Paper<Scissors ===");
    System.out.println();
    System.out.println("  - " + PLAY_OPTION + " -");
    System.out.println("  - " + HELP_OPTION + " -");
    System.out.println("  - " + LEAVE_OPTION + " -");

    System.out.println();
    System.out.print("Type: ");
    String c = scan.nextLine();

    switch (c) {
      case PLAY_OPTION:
        clear();
        Play();
        break;
      case HELP_OPTION:
        clear();
        Help();
        break;
      case LEAVE_OPTION:
        System.exit(0);
        break;
      default:
        System.out.println("Invalid");
    }
  }

  public static void clear() {
    try {
      System.out.print("\033\143");
      System.out.println(".");
      Thread.sleep(100);
      Thread.sleep(100);
      Thread.sleep(100);
      System.out.print("\033\143");
      System.out.println("..");
      Thread.sleep(100);
      Thread.sleep(100);
      Thread.sleep(100);
      System.out.print("\033\143");
      System.out.println("...");
      Thread.sleep(100);
      Thread.sleep(100);
      Thread.sleep(100);
      System.out.print("\033\143");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void Help() {
    try {
      System.out.println("Here are the rules:");
      System.out.println(" - Rock beats Scissors");
      System.out.println(" - Scissors beats Paper");
      System.out.println(" - Paper beats Rock");
      System.out.println("To play, type your choice (rock, paper, or scissors) and press enter.");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void Play() {
    try {
      while (true) {
        System.out.println("Do you wish to play against a Computer or a friend?");
        System.out.print("Enter `Computer or Friend`: ");
        String OponentChoice = scan.nextLine();

        if (OponentChoice.equalsIgnoreCase("Computer")) {

          // TODO : Implement PlayagainstComputer Function
          break;
        } else if (OponentChoice.equalsIgnoreCase("Friend")) {

          // TODO : Implement PlayagainstFriend Function
        } else {
          System.out.println("Invalid choice, please enter 'computer' or 'friend'.");
        }
      }
    } catch (Exception e) {
      System.exit(0);
    }
  }

  public static void PlayagainstComputer(){
    try{
      
      System.out.println("your are playing against a computer");

      while(true){
        

        System.out.println("Enter your choice (Rock,  Paper, or Scissors)");
        String userChoice = scan.nextLine();

      if(userChoice.equalsIgnoreCase("Rock") || userChoice.equalsIgnoreCase("Paper") || userChoice.equalsIgnoreCase("Scissors")){
      }
    }
  }

}