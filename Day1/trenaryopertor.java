package Java_Programs;


public class trenaryopertor {

	public static void main(String[] args) {
		//ternary
		
		int a = 10;
		int b = 5;
		
		int min = (a<b)?a:b;
		System.out.println(min);
		
		
		int age  = 19;
		
		String voteable = (age<=18)?(String) "Not Eligible":(String) "Eligible";
		System.out.println(voteable);
		
	}
	
}
