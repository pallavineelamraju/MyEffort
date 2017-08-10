package module2;

import java.util.Scanner;

public class Stringpalindrome {
	
	public static String inputstring(){
        
		Scanner s = new Scanner(System.in);
		
		System.out.print('\n');
	    System.out.print("enter the string:");

	    String word =s.nextLine();
	   
	    return word;
		
	}

	public static void main(String[] args) {
		String n = inputstring();
		boolean p = palindrome(n);
		if(p==true){
		System.out.print('\n');
		System.out.print("String is a palindrome");
		}
		else
		{System.out.print('\n');
		System.out.print("not a palindrome");
		}
	}

	private static boolean palindrome(String input) {
		
		char[] c = input.toCharArray();
		int n = c.length;
		char[] a = new char[n];
		System.out.print('\n');
		int j = 0;
		while(j<=n-1)
		for(int i = n-1;i>=0;i--){
			a[j]=c[i];
			j++;
		}	
		for(int k=0;k<=n-1;k++)
			System.out.print(a[k]);
				
		boolean p = false;
	    for(int l=0;l<=n-1;l++){
		
		if(c[l]==a[l]){
			p=true;
		}
		else
			p=false;
			
		}
	return p;
		
	
	}

}
