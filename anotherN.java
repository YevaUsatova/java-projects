import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String name;
      String firstName; 
      String middleName; 
      String lastName;
   
      
      name = scnr.nextLine();
      String [] newN = name.split(" ");
   
     
         if(newN.length == 3){
             firstName = newN[0];
             middleName = newN[1];
             lastName = newN[2];
             System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0)+ "." );
         }
         else {
             firstName = newN[0];
             lastName = newN[1];
             System.out.println(lastName + ", " + firstName.charAt(0) + ".");
         }
       
        

   }
}