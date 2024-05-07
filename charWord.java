import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String word;
      String newWord = "";
      word = scnr.nextLine();
      
      for (int i=0; i < word.length(); ++i){
         if(Character.isLetter(word.charAt(i))){
            newWord = newWord + word.charAt(i);
            
         }
      }
      System.out.println(newWord);
   }
}