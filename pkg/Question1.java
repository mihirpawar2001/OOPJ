	/*1)Write a program that takes a numerical grade as input and outputs the corresponding letter 
	grade using if-else statements.*/

package ass.java.pkg;
import java.util.*;
public class Question1 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int grade = sc.nextInt();
			if(grade>90) {
				System.out.println("Your grade is A+");
			}
			else if(grade>75) {
				System.out.println("Your grade is A");
			}
			else if(grade>60) {
				System.out.println("Your grade is B");
			}
			else if(grade>45) {
				System.out.println("Your grade is C");
			}
			else {
				System.out.println("Fail");
			}
			
		}
}
