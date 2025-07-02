package programming.numberSystem;

import java.util.Scanner;

public class ChechPolindrame {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number And Check it's Polindrome or not");
		int n=sc.nextInt(),temp=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
 if(rev==temp)
	 System.out.println("its a Palindrom Number");
	
	else
		 System.out.println("its a Palindrom not Number");
	

}
}