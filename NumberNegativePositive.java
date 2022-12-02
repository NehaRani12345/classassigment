package basic_programs.java;

import java.util.Scanner;

public class NumberNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		
		// number greater then zero
		if(num>0){
			System.out.println("number is positive");
			
		}
		//number is less then zero 
		else if(num<0){
			System.out.println("number is negative");
		}
		//number is zero
		else{
			System.out.println("number is zero");
		}
		sc.close();
	}

}
