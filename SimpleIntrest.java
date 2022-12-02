/**
 * 
 */
package basic_programs.java;
import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class SimpleIntrest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principle;
		float rateOfInterest,time,si,totalAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter priciple amount: ");
		principle=sc.nextInt();
		
		System.out.println("Enter the rate of Interest: ");
		rateOfInterest = sc.nextFloat();
		
		System.out.println("Enter time in years: ");
		time = sc.nextFloat();
		
		si=(principle*rateOfInterest*time)/100;
		System.out.println("Your Simple Interest is: "+si);
		
		totalAmount = principle+si;
		
		System.out.println("Total amount with intereset: "+totalAmount);
		sc.close();
	}

}
