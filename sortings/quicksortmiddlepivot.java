package sortings;

import java.util.Scanner;

public class quicksortmiddlepivot {
	
	private static void quicksort(int[] arr,int left,int right){
		int index = partition(arr,left,right);
		if(left < index-1)
			quicksort(arr,left,index-1);
		if(index < right)
			quicksort(arr,index,right);
		
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right)/2];
		while(left<=right){
			while(arr[left]<pivot) left++;
			while(arr[right]>pivot)right--;
			
			if(left<=right){
				int tmp = arr[left];
				arr[left]=arr[right];
				arr[right]=tmp;
				left++;
				right--;
			}
		}
		return left;
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
		
		int[] array = userinput();
		quicksort(array,0,array.length-1);
		for(int i = 0;i<array.length;i++)
			System.out.print(array[i] + "");

	}

	
}
