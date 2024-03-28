import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int divNum;
    int userNum;
    
    userNum = scnr.nextInt();
    divNum = scnr.nextInt();
    
    userNum = userNum / divNum;
    System.out.print(userNum + " ");
    userNum = userNum / divNum;
    System.out.print(userNum + " ");
    userNum = userNum / divNum;
    System.out.println(userNum);
      
   }
}