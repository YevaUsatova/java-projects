import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int dollar = 100;
      int quarter = 25;
      int dime = 10;
      int nickel = 5;
      int pennie;
     

      pennie = scnr.nextInt();
      
      if (pennie <=0){
         System.out.println("No change");
      }
      if (pennie > 0){
         if (pennie > 99){
           dollar = pennie / dollar;
           if(dollar == 1){
               System.out.println("1 Dollar");
           }
           else{
               System.out.println(dollar + " Dollars");
           }
         }
         
         pennie = pennie % 100;
      
         if ((pennie <= 99) && (pennie > 0)){
        
            if(pennie > quarter){
                quarter = pennie / quarter;
                if(quarter == 1){
                    System.out.println("1 Quarter");
                }
                else{
                    System.out.println(quarter + " Quarters");
                }
                pennie = pennie - (quarter * 25);
            }
            if (pennie > dime){
                dime = pennie / dime;
                if(dime == 1){
                    System.out.println("1 Dime");
                }
                else{
                    System.out.println(dime + " Dimes");
                }  
                pennie = pennie % 10 ;
            }
            
            if ((pennie <= 9) && (pennie >0) ){
                System.out.println("1 Nickel");
               }
                pennie = pennie - 5;
            if ((pennie < 5) && (pennie >0)){   
                if(pennie == 1){
                    System.out.println("1 Penny");
                }
                else{
                    System.out.println(pennie + " Pennies");
                }  
            }
            }
        }
    
    }
}
