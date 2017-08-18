package sortings;

import java.util.Scanner;

public class insertionsort {
	
public static  int[] userinput(){
    	
		
		Scanner s = new Scanner(System.in);
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
		
		int[] arr=userinput();
		int n = arr.length;
		 
		for(int j=1;j<n;j++){
			int key = arr[j];
			int i;
			for(i=j-1;i>-1&&arr[i]>key;i--)
				arr[i+1]=arr[i];
				arr[i+1]=key;
		}
		System.out.print('\n');
		System.out.print("the sorted array is:");
		for(int k:arr)
			System.out.print(k);
	}

}
