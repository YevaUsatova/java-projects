import java.util.Scanner;

public class CustomerAge {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Customer customer1 = new Customer();
      Customer customer2 = new Customer();
      
      // TODO: Declare name and age variables (string, and int)
      String nameC;
      int ageC;
      
      
      // TODO: Read name and age input for customer 1
      nameC = scnr.next();
      ageC = scnr.nextInt();
      
      // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())      
      customer1.setName(nameC);
      customer1.setAge(ageC);

      // TODO: Read name and age input for customer 2
      nameC = scnr.next();
      ageC = scnr.nextInt();
      
      // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
      customer2.setName(nameC);
      customer2.setAge(ageC);

      System.out.println("Customer that is older:");
      
      /// TODO: Determine older customer (use getAge())
      //       and output older customer's info (use printInfo())
      if(customer1.getAge() > customer2.getAge()){
         customer1.printInfo();
         }
         else{
           customer2.printInfo(); 
         }
       
   }
}