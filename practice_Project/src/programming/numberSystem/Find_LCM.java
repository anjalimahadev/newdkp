package programming.numberSystem;

import java.util.Scanner;

public class Find_LCM {

	public static void main(String[] args) {
		//lcm least comman factor hear choose those least number who's divisible by both given number
		//example one number is 3 and second number is 4 then choose those least number who's number can be divisible by 3 and 4
 Scanner sc=new Scanner(System.in);
 System.out.println("Enetr First Number");
 int n1=sc.nextInt();
 System.out.println("Enter Second Number");
 int n2=sc.nextInt();
 int lcm=n1>n2?n1:n2;
 while(true) {
	 if(lcm%n1==0 && lcm%n2==0) {
		 System.out.println("Lcm of "+n1 +"and "+n2+"is "+lcm);
	 break;
	 }
	 lcm++;
 }

 
	}

}
