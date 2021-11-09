package WhileLoop;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean keepAsking;
    do {
      System.out.print("Type an integer: "); // vi stille spørgsmålet
      if (!input.hasNextInt()) { //vi siger hvis det ikke er en int der bliver tastet så skal den
        input.nextLine(); //Taste noget ind igen
        keepAsking = true; //Her siger vi den skal blive ved med at spørger
      } else { // ellers hvis han taster en int ind
        int theNumber = input.nextInt(); // Her kan brugeren taste ind
        keepAsking = false; //Her skal den stoppe med at blive ved med at spørgerer
        System.out.println("you typed: " + theNumber); // her printer den så integer og teksten
      }
    } while (keepAsking); //vi siger teknisk set while(false) fordi den skal stoppe loopen

  }
}

