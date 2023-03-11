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
    String c = scan.nextLine();

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
      System.out.println("....");
      Thread.sleep(100);
      Thread.sleep(100);
      Thread.sleep(100);
      Thread.sleep(100);
      System.out.print("\033\143");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
