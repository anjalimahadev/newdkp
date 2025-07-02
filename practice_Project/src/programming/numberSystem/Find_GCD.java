package programming.numberSystem;

import java.util.Scanner;

public class Find_GCD {

public static void main(String[] args) {
		// GCD means Greatest commen divisor if choose two number then here we find  greatest commen multiple who's 
		//example one number is 3 and second number is 4 then choose those least number who's number can be divisible by 3 and 4
 Scanner sc=new Scanner(System.in);
 System.out.println("Enetr First Number");
 int n1=sc.nextInt();
 System.out.println("Enter Second Number");
 int n2=sc.nextInt(),gcd=0;
 int min=n1<n2?n1:n2;
 for(int i=1;i<=min;i++) {
	 if(n1%i==0 && n2%i==0) 
		gcd=i;
 }
 System.out.println(gcd);

	}

}
