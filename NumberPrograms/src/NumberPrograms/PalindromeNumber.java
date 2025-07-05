package NumberPrograms;

import java.util.Scanner;

public class PalindromeNumber 
{
			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
					System.out.print("Entre the Number: ");
					int n=sc.nextInt();
			       int reverseNum=0,temp=n;
			       
			       while(n>0)
			       {
			           int rem=n%10;
			           reverseNum=reverseNum*10+rem;
			           n=n/10;
			       }
			       
			       if(reverseNum==temp)
			       {
			           System.out.println("Palindrome");
			       }
			       else {
			    	   System.out.println("Not Palindrome");
			       }
			}
}
