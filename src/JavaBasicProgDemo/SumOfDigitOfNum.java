package JavaBasicProgDemo;

public class SumOfDigitOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sum of Digit of the given Number
		
		int num = 9879879;
		int Sum_digit = 0;
		
		while(num!=0) {
			 
			Sum_digit = Sum_digit + num%10; //
			num = num/10;
			
		}
		System.out.println(Sum_digit);
	}

}
