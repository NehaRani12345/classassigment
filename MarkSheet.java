/**
 * 
 */
package basic_programs.java;
import java.util.Scanner;
/**
 * @author Lenovo
 *
 */
public class MarkSheet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,total=0,rollno,percentage;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollno.: ");
		rollno = sc.nextInt();
		
		System.out.println("Enter the name of Student: ");
		name = sc.next();
		//sc.next();
		
		System.out.println("Enter the no. of subjects: ");
		n = sc.nextInt();
		
		int marks[] = new int[n];
		System.out.println("Enetr marks out of 100: ");
		for(int i=0; i<n; i++){
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}
		percentage = total/n;
		
		//print Output
		System.out.println("\nRollno.: "+rollno);
		System.out.println("Student Name: "+name);
		System.out.println("Total marks: "+total);
		System.out.println("Percentage: "+percentage+"%");
		
		//Calculating Grade
		if(percentage>80){
			System.out.println("Grade A");
		}
		else if (percentage>=60){
			System.out.println("Grade B");
		}
		else if (percentage >=45){
			System.out.println("Grade C");
		}
		else if(percentage>=35){
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail!");
		}
		sc.close();
	}

}
