package module2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class findGcd {

	public static void main(String[] args) {
		
		try{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of first number:");
		int n=s.nextInt();
		System.out.println("enter the value of second number:");
		int m=s.nextInt();
		int k=0;
		int greatest=0;
		if(m>n){
			greatest=m;
		}
		else{
			greatest=n;
		}
		
		for(int i=1;i<=greatest;i++){
	
			if((n%i==0)&&(m%i==0)){
				k=i;
			}
		}
		System.out.print("The greatest common devisor is:"+k);
		
	}catch(InputMismatchException e){
		
		System.out.println("Input not given properly ,give the right input. ");
	}

	}
}
