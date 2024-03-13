/*Implement a program that calculates the Body Mass Index (BMI) based on height and weight 
input using if-else to classify the BMI into categories  (under weight, normal weight, overweight, 
etc.)*/

package ass.java.pkg;
import java.util.*;
public class Question6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Make sure height in meters and weight in kilograms! ");
		float wt = sc.nextFloat();
		float ht = sc.nextFloat();	
		
		float bmi = wt/(ht*ht);
		System.out.println(bmi);
		if(bmi<=18) {
			System.out.println("Under Weight");
		}
		else if (bmi>18 && bmi <=25 ) {
			System.out.println("normal Weight");
		}
		else {
			System.out.println("Over Weight");
		}
		

	}
	

}
