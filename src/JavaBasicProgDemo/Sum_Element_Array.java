package JavaBasicProgDemo;

public class Sum_Element_Array {

	public static void main(String[] args) {
		
		
	//sum of the element of the given array
		
		int num[]= {3,4,6,7};
		
		int sum = 0;
		
		for(int i=0; i<=num.length-1; i++) {
		sum = sum +num[i];
		}
		
		
	System.out.println("Sum of element of the array " +sum);
	}

}
