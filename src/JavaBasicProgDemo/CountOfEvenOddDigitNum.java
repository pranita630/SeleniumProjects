package JavaBasicProgDemo;

public class CountOfEvenOddDigitNum {

	public static void main(String[] args) {
		
		
		int num = 1234567899;
		int even_num_count = 0;
		int odd_num_count = 0;
		
		while(num!=0) {
			
			if((num%10)%2==0)
			{
				
				even_num_count++;
				
				
				
			}
			else {
				odd_num_count++;
				
				
			}
			num= num/10;
			
		}
		System.out.println("EvenNumber Count is  "+even_num_count);
		System.out.println("Odd Number Count is "+odd_num_count);

	}

}
