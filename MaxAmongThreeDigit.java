package basic_programs.java;
import java.util.Scanner;
public class MaxAmongThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number1:");
		num1=scan.nextInt();
		System.out.println("Enter number2:");
		num2=scan.nextInt();
		System.out.println("Enter number3:");
		num3=scan.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("first number is max number");
			
		}
		else if(num2>num3 && num2>num3){
			System.out.println("second number is max number");
		}
		else{
			System.out.println("third number is max number");
		}
		scan.close();
	
		
	}

}

