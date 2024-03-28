import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      double prod;
      double ave;
      
      /* Type your code here. */
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      prod = (double)(num1) * (double)(num2) * (double) (num3) * (double)(num4);
      ave = (num1 + num2 + num3 + num4) / 4.0;
      
      System.out.print((num1 * num2 * num3 * num4) + " ");
      System.out.println((num1 + num2 + num3 + num4) / 4);
      
      System.out.printf("%.3f", prod);
      System.out.print(" ");
      System.out.printf("%.3f\n", ave);
   }
}