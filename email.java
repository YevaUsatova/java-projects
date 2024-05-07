import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String name;

		
		name = scnr.nextLine();
		String [] strName = name.split(" ");
		if(strName[0].length() > 6){
		   System.out.println("Your login name: " + strName[0].substring(0,6) + strName[1].charAt(0) + "_" + strName[2].charAt(3));
		}
		else { 
		   System.out.println("Your login name: " + strName[0] + strName[1].charAt(0) + "_" + strName[2].charAt(3));
		}

	}
}