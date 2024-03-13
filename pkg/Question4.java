/* 4)Write a program that takes a number representing a weekday (1-7) and prints the name of the 
weekday using switch-case.  */

package ass.java.pkg;
import java.util.*;
public class Question4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number for weekday: ");
		System.out.println("1 for Monday ");
		System.out.println("2 for Tuesday ");
		System.out.println("3 for Wednesday ");
		System.out.println("4 for Thursday ");
		System.out.println("5 for Friday ");
		System.out.println("6 for Saturday ");
		System.out.println("7 for Sunday ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Monday ");break;
		case 2: System.out.println("Tuesday ");break;
		case 3:System.out.println("Wednesday ");break;
		case 4:System.out.println("Thursday ");break;
		case 5:System.out.println("Friday ");break;
		case 6:System.out.println("Saturday ");break;
		case 7:System.out.println("Sunday ");break;
		default : System.out.println("Invalid choice!: ");
		
		}
		
	}
	

}
