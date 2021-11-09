package RepetationLoops;

import java.util.Scanner;

public class Excersize1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0; //Sum starter med at være 0
    System.out.println("Write 10 numbers");
    for (int i=1; i<11;i++){ //Her laver vi en for loop om kører fra 0-9
      System.out.print(i+". Number is: ");
      sum=sum+input.nextInt(); //Her ændre vi så sum værdien så den nu skal + med det indtastede
      //den vil gøre det 10 gange det står i for loopen
    }
    System.out.println("The average is: "+sum/10);
  }
}

