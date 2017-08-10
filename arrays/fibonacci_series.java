package module2;



public class fibonacci_series {

	public static void main(String[] args) {
				
		fibonacci_series();
		number_series();
		
		
			}
		public static void fibonacci_series() {
		
		System.out.print("The fibonacci series is:");
		int i = 0;
		int j = 1;
		int k = i+j;
		
		while(k<=10){
		
		System.out.print(k);
		k=k+i;
		i=j;
		j=k;
		}
		}
		
		
		
		public static void number_series()
		{
			
		System.out.print("\n");
		System.out.print("The Number series is:");
		int i = 0;
		while(i<10)
		{
		
		System.out.print(i);
			i=i+1;
				
		}
		System.out.println();
	   }
}
