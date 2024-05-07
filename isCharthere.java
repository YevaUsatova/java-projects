import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char charIn;
      String word;
      int num = 0;
      
      charIn = scnr.next().charAt(0);
      word = scnr.nextLine();
      
      for(int i = 0; i < word.length(); ++i){
         if(word.charAt(i) == charIn) {
            num = num + 1;
         }
      }
      if(num == 1){
         System.out.println(num + " " + charIn);
      }
      else {
         System.out.println(num + " " + charIn + "'s");
      }
   }
}
