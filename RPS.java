import java.lang.Thread.State;
import java.util.Scanner;

//Implemtent Ignore case funcinality
public class RPS {
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

}