/*3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as 
input and performs the operation using switch-case. */
package ass.java.pkg;
import java.util.*;
public class Question3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		int sum = 0;
		int product=1;
		int division=1;
		int subtract=0;
		
		System.out.println("Choose operation:");
		System.out.println("1 for Addition");
		System.out.println("2 for product");
		System.out.println("3 for division");
		System.out.println("4 for substraction ");
		
		 int choice = sc.nextInt();

		switch (choice) {
			case 1: 
				sum = n1+n2;
				System.out.println("The sum is: " + sum);break;
			case 2:
				product=n1*n2;
				System.out.println("The product is: " + product);break;
			case 3:
				division=n1/n2;
				System.out.println("The Division is: "+ division);break;
			case 4:
				subtract=n1-n2;
				System.out.println("The Substraction is: "+ subtract);break;
			default:
	            System.out.println("Invalid choice!: ");
				}
				
	}
		
	}


