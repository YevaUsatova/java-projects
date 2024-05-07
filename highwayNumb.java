import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      primaryNumber = highwayNumber % 100;
        
      if ((highwayNumber > 0) && (highwayNumber <= 99)){
        if(highwayNumber % 2 == 1){
            System.out.println("I-" + highwayNumber + " is primary, going north/south.");
        }
        else{
            System.out.println("I-" + highwayNumber + " is primary, going east/west.");
        }
      }
      
      else if ((highwayNumber > 100) && (highwayNumber <= 999)){
        if (highwayNumber % 100 == 00 ){
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
        else if (primaryNumber % 2 == 1) {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
        }
        else {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
        }

      }
      else {
        System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }

   }
}

