package JavaBasicProgDemo;

public class ReverseInteger {

	public static void main(String[] args) {
		
		
		int num = 123456;
		
		int rev = 0;
		// using wile loop
		
		while(num!=0) {
			
			rev = rev*10 +num%10;
			num = num/10;
		}
		
		System.out.println("Reverse value is " +rev);
		
		//using StringBuffer
		
		int number = 45678;
		
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		
		System.out.println("Reverse Value is " +sb.reverse());
		
		
		
		
		
         
	}
	
	

}
