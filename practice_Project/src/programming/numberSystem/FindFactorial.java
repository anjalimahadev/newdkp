package programming.numberSystem;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("please Enter the Number and find Factorial");
		int n=sc.nextInt();
		int sum=0,f=1;
		for(int i=n;i>=1;i--) {
				f=f*i;
			}
		System.out.println("the Factorial Of" +n +"is"+ f);
		}

	}


