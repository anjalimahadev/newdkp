package programming.numberSystem;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		//perfect number means if choose any number suppose take 6 and find who's number those 6%i==0 and takes factors expect number  and add 
		//compair to number if sum of factor is equals to number that number is Perfect number
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the Number And Check it s is Perfect Or Not");
 int n=sc.nextInt();
 int sum=0;
 for(int i=1;i<n;i++) {
	 if(n%i==0)
		 sum=sum+i;
 }
 if(sum==n)
	 System.out.println("Given Number is Perfect number");
	
	else
		System.out.println("Given Number Is Not Perfect Number");
	}
}
