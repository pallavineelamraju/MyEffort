package sortings;

import java.util.Scanner;

public class quicksortlastpivot {
	
	private static int partition(int[] arr, int p, int r){
		
		int tmp,i,x,j;
		x=arr[r];
		i=p-1;
		for(j=p;j<=r;j++){
			if(arr[j]<x){
				i++;
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		i++;
		tmp=arr[i];
		arr[i]=arr[r];
		arr[r]=tmp;
		
		return i;
		
	}
	
	private static void quicksort(int[] arr,int p,int r){
		int q;
		
		if(p<r){
			
			q=partition(arr,p,r);
			quicksort(arr,p,q-1);
			quicksort(arr,q+1,r);
				
		}
	}
	
	private static int[] userinput() {
		
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

	

	public static void main(String[] args) {
		
		int[] arr ;
		int r;
		int p=0;
		
		arr=userinput();
		r = arr.length-1;
		
		quicksort(arr,p,r);
		for(int i=0;i<=arr.length-1;i++)
		System.out.print(arr[i] + "");
		
		
	}

	
}
