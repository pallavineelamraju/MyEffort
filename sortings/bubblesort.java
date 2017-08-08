package sortings;

import java.util.Scanner;

import org.junit.Test;

public class bubblesort {
	
	int arr[];
	int i,j;
	
	@Test
	public  void main(){
		
		int i;
		arr=userinput();
		int n=arr.length;
				
		for(i= 0;i<n;i++)
		{
			for(int j = 1;j<n-i;j++){
				
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.print('\n');
	    System.out.print("The sorted elements are:");
		
		for(i=0;i<arr.length;i++)
		{ 
		       
		       System.out.print(arr[i]);

		 }
		
	}
	
	public  int[] userinput(){
    	
		
		Scanner s = new Scanner(System.in);
		
		System.out.print('\n');
	    System.out.print("enter number of elements:");

	    int n=s.nextInt();

	    int arr[]=new int[n];

	    System.out.print("enter elements:");

	    for(int i1=0;i1<n;i1++){//for reading array
	        arr[i1]=s.nextInt();

	    }
	    s.close();
		System.out.print('\n');
	    System.out.print("the Elements in the array are:");
	    for(int i1=0;i1<arr.length;i1++){ //for printing array
	       
	       System.out.print(arr[i1]);

	    }
		return arr;
	}
	
}
