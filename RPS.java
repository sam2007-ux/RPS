import java.lang.Thread.State;
import java.util.Scanner;

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
    String IntroOption = scan.nextLine();

    switch (IntroOption) {
      case PLAY_OPTION:
        clear();
        break;
      case HELP_OPTION:
        // TODO: Implement help functionality
        break;
      case LEAVE_OPTION:
        System.exit(0);
        break;
      default:
        System.out.println("Invalid option. Please try again.");
    }
  }

  public static void clear() {
    try {
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void help() {

  }

}
