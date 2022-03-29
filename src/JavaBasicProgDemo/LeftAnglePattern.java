package JavaBasicProgDemo;

public class LeftAnglePattern {

	public static void main(String[] args) {

		/*
		 * Left Angle Star Pattern
		 *
		 **
		 ***
		 ****
		 * 
		 * 
		 */

		int i, j;
		//for outer loop is row 
		for (i = 1; i <= 4; i++) {
			// inner loop is for space
			for (j = 3; j >= i; j--) {

				System.out.print(" ");
				}
				// inner loop is for column
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				
			System.out.println();

		}
		

	}

}
