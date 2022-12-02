package basic_programs.java;

import java.util.Scanner;


class Sum1 
{
	int sum,a,b,mul,div,sub;
	Scanner sc=new Scanner(System.in);
	
	void add()
	{
		System.out.print("Enter the number A: ");
		a=sc.nextInt();
		System.out.print("Enter the number B: ");
		b=sc.nextInt();
		
		sum=a+b;
		
	}
	void mul()
	{
	
		mul=a*b;
	}
	void priya()
	{
		div=a/b;
	}
	void shobha()
	{
		sub=a-b;
	}
	void display()
	{
		System.out.println("============================");
		System.out.println("Sum of a+b: = "+sum+"\nMultiplication of a*b: = "+mul+"\nDivide of a/b: = "+div+"\nsub of a-b: = "+sub);
		
		
	}
	
}
public class Example
{
	

	public static void main(String[] args) 
	{

		Sum1 s=new Sum1();
		Scanner sc=new Scanner(System.in);
		
		s.add();
		s.mul();
		s.priya();
		s.shobha();
		s.display();
		sc.close();
		
	}

}
