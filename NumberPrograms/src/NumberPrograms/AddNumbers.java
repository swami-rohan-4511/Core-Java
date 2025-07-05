package NumberPrograms;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		int num1,num2;
		
		System.out.print(" Entre the first Number :");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.print(" Entre the Second Number :");
		num2=sc.nextInt();
		System.out.println();
		System.out.print("Sum of Two Numbers is= "+ addTwoNumers(num1,num2));
			
		
	}
	
	public static int addTwoNumers(int a,int b)
	{
		return a+b;
	}
	
	
}
