/*2)Write a program that checks if a given year is a leap year or not using both if-else and 
switch-case.  */

package ass.java.pkg;
import java.util.*;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("This is not a leap year");
		}
	}
}
