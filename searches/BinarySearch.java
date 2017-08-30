package searches;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
	static Scanner s = new Scanner(System.in);
	
public static  int[] userinput(){
	
	
		System.out.print('\n');
	    System.out.print("enter number of elements:");

	    int n=s.nextInt();

	    int arr[]=new int[n];

	    System.out.print("enter elements in sorted order:");

	    for(int i1=0;i1<n;i1++){//for reading array
	        arr[i1]=s.nextInt();

	    }
	    System.out.print("the Elements in the array are:");
	    for(int i1=0;i1<arr.length;i1++){ //for printing array
	       
	       System.out.print(arr[i1]);

	    }
	    return arr;
	 
	  }
	
	public static void main(String[] args) {
		
		try{
		
		int[] arr = userinput();
		int l = arr.length;
		int i = 0;
		System.out.println();
		System.out.print("Input the element to be searched");
		int e = s.nextInt();
		bsearch(arr,i,l,e);
		
		}catch(InputMismatchException  e){
			System.out.print("Input Not correct");
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.print("Element Not Found");
		}catch(StackOverflowError se){
			System.out.print("Element Not Found");
		}
 	}
	
	public static void  bsearch(int[] arr,int i,int l,int e){
		
		
		if((l-i)== 0){
			System.out.print("Array has no elements");
		}
		int mid = (e+i)/2;
		if(e!=arr[mid]){
			System.out.print("Element not found in the search");
		}
		 if(e==arr[mid]){
			 System.out.print("Element is found at position:" +(mid+1));
		 }
		 if(e < arr[mid]){
			 bsearch(arr,i,mid,e);
		 } 
		 if(e > arr[mid]){
			 bsearch(arr,mid,l,e);
		 }
		 
	 
	}
}
