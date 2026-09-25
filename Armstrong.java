package Date2209practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr your number");
		int n=sc.nextInt();
		System.out.println("Your number"+n);
		
		int org;
		org=n;
		int sum=0;
		
		for(;n>0;n=n/10)
		{
			int digit=n%10;
			sum=sum+digit*digit*digit;
			
		}
		if(sum==org)
		{
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
	}

}
