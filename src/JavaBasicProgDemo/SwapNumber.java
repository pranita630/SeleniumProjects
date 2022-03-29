package JavaBasicProgDemo;

public class SwapNumber {

	public static void main(String[] args) {

		
		// using temp variable 
		
		int a = 20;
		
		int b = 30;
		
		int c;
		
		 c= a;
		 a = b;
		 b= c;
		
		 
		 System.out.println("value of a is " +a );
		 System.out.println("value of b is " +b );
		 
		 
		 //using without third valiable
		 
		 int x= 30;
		 int y= 40;
		 
		 x= x+y; //30+40 =70
		 y=x-y;   // 70-40 = 30
		 x= x-y; // 70-30= 40
		 System.out.println("------------------------------- ");
		 System.out.println("value of x is " +x);
		 System.out.println("Value of y is " +y);
		 
		 
 		 
		 
		 
	}
	
	

}
