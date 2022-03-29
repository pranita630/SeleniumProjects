package JavaBasicProgDemo;

public class SwapString {

	public static void main(String[] args) {

		
		String s1 = "hello";
		String s2 = "Java";
		
		System.out.println("String S1 is "+s1);
		System.out.println("String s2 is " +s2);
		
		//using 3rd variable ----
		String s3;
		
		s3=s1;
		s1=s2;
		s2=s3;

		System.out.println("String S1 after swap is "+s1);
		System.out.println("String s2 after swap is " +s2);
		
		// using without 3rd variable
			
		 String s4= "java";
		String s5 = "Selenium";
		
		
		s4= s4+s5; //javaSelenium
		
		s5= s4.substring(0,s4.length()-s5.length()); //javaSelenium-Selenium = java
		
		s4= s4.substring(s5.length()); 
		
		System.out.println(" After Swaping the s4 " +s4);
		System.out.println("After Swaping the s5 " +s5);
		
	
		
		
	}

}
