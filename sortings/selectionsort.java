package sortings;

import java.util.Scanner;

public class selectionsort {
	

	public static  int[] userinput(){
    	
		
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
		System.out.print("the Elements in the array are:");
	    for(int i1=0;i1<arr.length;i1++){ //for printing array
	       
	       System.out.print(arr[i1]);

	    }
		return arr;
	}
	public static void main(String[] args) {
		int i;
		int[] arr;
		arr=userinput();
		int n=arr.length;
				
		for(i= 0;i<n-1;i++)
		{
			int index=i;
			
			for(int j=i+1;j<n;j++){
				
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int smallnum = arr[index];
			arr[index]=arr[i];
			arr[i]=smallnum;
			
		}
		System.out.print('\n');
	    System.out.print("the sorted order is:");
		for(int k:arr){
			System.out.print(k);
		}
	
		
	}

}
