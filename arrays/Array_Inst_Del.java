package module2;

import java.util.Scanner;

public class Array_Inst_Del {
	static Scanner s = new Scanner(System.in);
	private static Object arr;
	public static void main(String[] args) {
			
			String ans="yes";
			int[] arr = null;
			
			while(ans.equals("yes"))
			{
			   arr=input();
			   add(arr);
			   System.out.print('\n');
			   System.out.print("Do you want to give more input?");
			   ans=s.next();
			      
			}
			System.out.print("Do you want to delete some elements?:");
			ans=s.next();
			while(ans.equals("yes"))
			{
				delete(arr);
				System.out.print('\n');
				System.out.print("Do you want to delete some more elements?:");
				ans=s.next();
			}
			
		}
	
		private static int[] input(){
			
			System.out.print('\n');
		    System.out.print("enter number of elements in an array:");
		    int n=s.nextInt();
		    //System.out.print('\n');
		   // System.out.print("enter number of elements you want to add:");
		  //  int num =s.nextInt();
		    int arr[]=new int[n+1];

		    System.out.print("enter elements:");

		    for(int i=0;i<n;i++){	//for reading array
		        arr[i]=s.nextInt();

		    }
		    System.out.print("the Elements in the array are:");
		    for(int i=0;i<arr.length;i++){ 	//for printing array
		       
		       System.out.print(arr[i]);
		    }
			return arr;
			}

		private static void delete(int[] arr) {
			
			System.out.print("Enter the element to delete:");
			int p = s.nextInt();
			int flag=0,pos=0;
			int len = arr.length;
			for(int i=0;i<len;i++){
				if(arr[i]==p){
					flag=1;
					pos=i;
					break;
				}
				else{
					flag=0;
				}
			}
			if(flag==1){
				
				for(int j=pos+1;j<len;j++)
				{
				arr[j-1]=arr[j];
				}
				arr[len-1]=0;
				for( int i=0;i<len;i++)
				{ 	//for printing array
				       
				      System.out.print(arr[i]);

				}
			}
			else
			{
				System.out.print('\n');
				System.out.print("The element was not found");
			}	
				
		}

		private static void add(int[] arr) {
				
			
			System.out.print('\n');
			System.out.print("Enter the number to be added:");
			int a = s.nextInt();
		//	System.out.print('\n');
			System.out.print("Enter the position to add the number in:");
			int p = s.nextInt();
			int length=arr.length;
			if(p>length | p<1){
				System.out.print("Range is out of array");
			}
			else
			{
			int i;
			for(i=length-1;i>p-1;i--){
				arr[i]=arr[i-1];
			}
			arr[p-1]=a;
			for( i=0;i<arr.length;i++){ 	//for printing array
			       
			       System.out.print(arr[i]);

			    }
			}
					
			
			}
			
			
		}
			
	


