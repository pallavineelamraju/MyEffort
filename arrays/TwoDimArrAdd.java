package module2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class TwoDimArrAdd {

	public static void main(String[] args) {
	try{
	Scanner s =new Scanner(System.in);
	System.out.print("Number of rows in first matrix:");
	int rows=s.nextInt();
	System.out.print("Number of cols in first matrix:");
	int cols=s.nextInt();
	System.out.print("Enter the row and column numbers for first matrix:");
	int a[][] = new int[rows][cols];
	int c[][] = new int[rows][cols];
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			a[i][j] = s.nextInt();
			System.out.print(a[i][j]+" "); 
		}
		System.out.println();//new line 
	}
	
	System.out.println();
	
	/*System.out.print("+");
	System.out.print("Number of rows in second matrix:");
	int rows2=s.nextInt();
	System.out.print("Number of cols in second matrix:");
	int cols2=s.nextInt();*/
	System.out.print("Enter the row and column numbers for second matrix:");
	int b[][] = new int[rows][cols];
	System.out.println();
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			b[i][j] = s.nextInt();
			
			System.out.print(b[i][j]+" "); 
		}
		System.out.println();//new line 
	}
	
	System.out.println();
	System.out.print("The result matrix is:");
	System.out.println("\n");
		
	for(int i=0;i<rows;i++){  
	  for(int j=0;j<cols;j++){  
		c[i][j]=a[i][j]+b[i][j]; 
		System.out.print(c[i][j]+" ");  
		}  
		System.out.println();//new line  
		}  
	}
	catch(InputMismatchException e){
		System.out.println("Input not given properly ,give the right input. ");
	}
	}

}
