package JavaBasicProgDemo;

public class ReverseString {

	public static void main(String[] args) {
		
		
		// Using StringBuffer
		
		String s = "Hello world";
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(" Reverse String  of " +s+  " is "  +sb.reverse());
		

		
		// Using for loop:
		
		String s_str = "Hello Java";
		String rev_str = "";
		int len_str= s_str.length();
		
		for(int i =len_str-1; i>=0; i--) {
			
			rev_str = rev_str+s_str.charAt(i);
			
		}
		System.out.println(" Reverse Value is " +rev_str);
	}

}
