import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      int ageYears;
      double wghtPounds;
      int heartRate;
      int minTime;
      double aveCalories;
      
      ageYears = scnr.nextInt();
      wghtPounds = scnr.nextDouble();
      heartRate = scnr.nextInt();
      minTime = scnr.nextInt();
      
      aveCalories = ((ageYears * 0.2757) + (wghtPounds * 0.03295) + (heartRate * 1.0781) - 75.4991) * (minTime / 8.368);
      
      System.out.print("Calories: ");
      System.out.printf("%.2f", aveCalories);
      System.out.print(" calories");
   }
}