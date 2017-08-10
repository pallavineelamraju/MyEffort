package module2;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.print("Enter the number to reverse:");
		System.out.print('\n');
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int q=n;
		int i,p,rev=0;
		
		while(n!=0){
			p = n%10;
			rev=rev*10+p;
			n=n/10;
		}
		System.out.print('\n');
		System.out.print("the  reverse number is:"+ rev);
		
		if(q==rev)
		{
			System.out.print('\n');
			System.out.print("The number is a palidrome:");
		}
		else
		{
			System.out.print('\n');
			System.out.print("The number is not a palidrome:");
		}
	}

}
