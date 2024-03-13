/*5)Write a program that takes a character as input and determines whether it’s a vowel or a 
consonant using if-else.*/
package assignments;
import java.util.*;
public class Question5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");

		char ch = sc.next().charAt(0);
		if(ch >='a'&& ch<='z') {
			if(ch == 'a' ||ch =='e'||ch =='i'||ch =='o'||ch =='u' ) {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a consonant");
		}
		}
}
}
