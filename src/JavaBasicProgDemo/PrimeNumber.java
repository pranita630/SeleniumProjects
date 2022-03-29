package JavaBasicProgDemo;

public class PrimeNumber {

	public static void main(String[] args) {


		// Prime Number  -- it will divide by 1 and itself
		
		int num = 3;
		int count=0;
	    
		for(int i=1; i<=num; i++){
		
			
			if(num%i==0)
				count++;
		}
		
		if(count==2) {
			System.out.println("Prime Number " +num);
		}

		else {
			System.out.println(" Not a prime Number");
		}
	}

}
