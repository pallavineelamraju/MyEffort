package sortings;

import java.util.Scanner;



public class quicksort {
	
	
	
	
	public static void main(String[] args){
		int[] arr;
		int p = 0;
		arr=userinput();
		int r = arr.length-1;
		
		sort(arr,p,r);
		for(int i=0;i<arr.length;i++){ //for printing array
	       
	       System.out.print(arr[i]);

	    }
		
		
		
	}

	public static void sort(int[] arr,int p,int r) {
				
		int q ;
		
		if(p<r){
		q=partition(arr,p,r);
		sort(arr,p,q-1);
		sort(arr,q+1,r);
		}
		
	
		
	}
		
	public static int partition(int[] arr, int p, int r) {
		
		
		
		int i = p-1;
		int x=arr[r];
		for(int j=p;j<=r;j++)
		{
			
			if(arr[j]<x){
				
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
					
		}
		i++;
		
		int temp = arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		
		return i;
		
	}

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
		
		return arr;

}
}
