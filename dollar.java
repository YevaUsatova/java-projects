import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      
      int numQrt;
      int numDime;
      int numNck;
      int numPenn;
      double totDollar;
      
      numQrt = scnr.nextInt();
      numDime = scnr.nextInt();
      numNck = scnr.nextInt();
      numPenn = scnr.nextInt();
      
      numQrt = numQrt * 25;
      numDime = numDime * 10;
      numNck = numNck * 5;
      totDollar = (numQrt + numDime + numNck + numPenn ) * 0.01;
      
      
      System.out.printf("Amount: $%.2f\n", totDollar);
   }
}