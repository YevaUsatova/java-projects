public class Pet {
    // TODO: Declare private fields 
    private String name;
    private String type;
    private int age;
    
    // TODO: Define no-arg constructor 
    public Pet(){
       name = "unknown";
       type = "unknown";
       age = 0;
    }
   
   // TODO: Define overloaded constructor
   
    public Pet(String name, String type, int age){
      name = name;
      type = type;
      age = age;
    }
      

   // TODO: Define getter (accessor) methods and setter (mutator) methods
   public void setName( String namec){
      name = namec; 
   }
   public void setName(String typec){
      type = typec;
   }
    public void setAge(int agec){
      age = agec;
   }
   
   public void getName(){
      System.out.print(type);
   }
   public void getName(){
      System.out.print(type);
   }
   
   public void getAge(){
      System.out.print(age);
   }
}




import java.util.Scanner;

public class PetInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String name, type;
      int age;            

      Pet pet1 = new Pet();      
   
      name = scnr.next();
      type = scnr.next();      
      age = scnr.nextInt();
      Pet pet2 = new Pet(name, type, age);     
      
      name = scnr.next();
      type = scnr.next();      
      age = scnr.nextInt();
      Pet pet3 = new Pet(name, type, age);        
      
      System.out.println("Name: " + pet1.getName());
      System.out.println("Type: " + pet1.getType());
      System.out.println("Age: " +  pet1.getAge() + "\n");
      
      System.out.println("Name: " + pet2.getName());
      System.out.println("Type: " + pet2.getType());
      System.out.println("Age: " +  pet2.getAge()  + "\n");
      
      System.out.println("Name: " + pet3.getName());
      System.out.println("Type: " + pet3.getType());
      System.out.println("Age: " +  pet3.getAge());    
   }
}