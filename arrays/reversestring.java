package module2;

import java.util.Scanner;

public class reversestring {
	
	public static String inputstring(){
        
		Scanner s = new Scanner(System.in);
		
		System.out.print('\n');
	    System.out.print("enter the string:");

	    String word =s.nextLine();
	    //System.out.print(word);

	    return word;
		
	}

	public static void main(String[] args) {
		
		String input = inputstring();
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
				
	}
}
