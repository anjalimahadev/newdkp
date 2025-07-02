package programming.numberSystem;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number and check tt's Perfect Square or not");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<n;i++) {
			if(i*i==n) {
				flag=true;
				break;
			}
		}
		if(flag==true)
				System.out.println("it's Perfect Square");
			else
				System.out.println("its is not Perfect Square");
		}

	}


