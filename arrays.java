import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Double [] myArr = new Double [3];
      int i;
      Double ave = 0.0;
       
      for(i = 0; i < myArr.length; ++i){
         myArr[i] = scnr.nextDouble();
      }
      System.out.print("Array items: ");
      for(i = 0; i < myArr.length; ++i){
         if(i < 2){
            System.out.print(myArr[i] + " ");
         }
         else{
            System.out.print(myArr[i] + "\n");
         }
         
         
      }
      for(i = 0; i < myArr.length; ++i){
         ave = ave + myArr[i];
      }
      System.out.println("Average: " + ave / 3);
       
      
      
      
      
      
   }
}