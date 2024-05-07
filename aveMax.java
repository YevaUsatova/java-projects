import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num;
      int max;
      int i ;
      Double ave = 0.0; 
      
      num = scnr.nextInt();
      max = num;
      
      i = 0;
      while(num >= 0){
         i = i + 1;
         ave = ave + num;
         if(max <= num){
            max = num;
         }
         
         num = scnr.nextInt();
        
      }
      
      ave = ave / i;
      
      System.out.print(max +  " ");
      System.out.printf("%.2f\n", ave);
      
   }
}