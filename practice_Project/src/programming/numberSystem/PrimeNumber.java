package programming.numberSystem;

import java.util.Scanner;

public class PrimeNumber {
//PrimeNumber means it is divisible by one and it self only ,no of div is =2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
        	if(n%i==0)
        		count++;
        }
        if(count==2)
        System.out.println("Given number is Prime Number");
        else 
        	System.out.println("Given Number is Not PrimeNumber");
	}

}
