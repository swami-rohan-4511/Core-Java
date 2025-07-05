package NumberPrograms;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Entre the Number: ");
	int n=sc.nextInt();
	int cnt = 0;

    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            cnt++;
            if (n / i != i) {
                cnt++;
            }
        }
        if (cnt > 2) {
            break;
        }
    }

    if (cnt == 2) {
        System.out.println("Prime Number");
    } else
    {
    	System.out.println("Not a Prime Number");
    }
}
}
