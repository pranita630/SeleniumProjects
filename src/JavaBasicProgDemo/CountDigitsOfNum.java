package JavaBasicProgDemo;

public class CountDigitsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Count digits in a number
		
		
		int num = 7987987;
		int count=0;
		
		while(num!=0) {
			num = num/10;
			count++;
			
		}
		System.out.println(" Count of the Number is " +count);
	}

}
