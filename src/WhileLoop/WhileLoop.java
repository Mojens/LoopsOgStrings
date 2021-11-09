package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //Laver scanner objektet

    System.out.print("Type an integer: "); //Stiller spørgsmål
    while (!in.hasNextInt()) {//!in.hasNextInt() betyder også in.hasNextInt()==false pga udråbstegnet
      // While starter en loop indtil der er blevet tastet en int, som bliver beskrevet ved in.hasNextInt()
      System.out.print("You have to type a Integer!! Try again...: ");
      in.nextLine(); //Giver brugeren mulighed for at taste en string ind hvilket er god for så kan man indtaste
      //(Double, float, String osv..)
    }
    //While skal være før int theNumber = in.nextInt(). Da ellers vil den fejle direkte hvis man eksempel skriver en string.
    // I første omgang, fordi den kører i rækkefølge.
    int theNumber = in.nextInt(); //Definer at det en integer og laver in.nextInt så brugeren kan skrive
    System.out.println("you typed: "+ theNumber);

  }
}

