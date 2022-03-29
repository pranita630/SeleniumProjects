package JavaBasicProgDemo;

public class CountNoEvenOdd {

	public static void main(String[] args) {
		// Count the number of even & odd digit in a number

		int number = 7979089;
		int even_num_count = 0;
		int odd_num_count = 0;

		while (number != 0) {
 
			if ((number % 10)%2 == 0) {
				
				even_num_count++;
				
			}
			else {
				odd_num_count++;
			}
			number = number / 10;

		}

		
		System.out.println(" Even Number count is " +even_num_count);
		System.out.println(" odd number count is " +odd_num_count );
		
	}
	

}
