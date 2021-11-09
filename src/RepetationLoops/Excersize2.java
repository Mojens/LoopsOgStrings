package RepetationLoops;

public class Excersize2 {
  public static void main(String[] args) {
    System.out.println("Opgave a: ");
    pyramide();
    System.out.println("Opgave b:");
    lodretFirkant();
  }

  public static void pyramide() {
    int raekke = 4; //Her siger jeg hvor mange rækker jeg vil have

    for (int i = 1; i <= raekke; i++) { //Hvor mange * der skal være på hver række
      for (int x = 1; x <= i; ++x) { //x=1 så printer den alle 4, og jo tættre x kommer på raekke = 4, så vil
        // Der være en mindre række som vises.
        System.out.print("* "); //Her vil de alle komme på samme række
      }
      System.out.println(); // Den her gør så de kommer lodret også
    }
  }

  public static void lodretFirkant() {
    int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}




