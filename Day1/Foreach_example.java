package Java_Programs;

public class Foreach_example {

	public static void main(String[] args) {
		
		String[] names = {"Virat","Rohit","Dhoni","Sachin","Sourav"};
		
		//traditional forloop
		for (int i = 0; i< names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		//for each loop
		for (String n : names) {
			
			System.out.println(n);
		}
		
		int[] nums = {1,2,5,7,8,9,3,4,6,5};
		for (int m : nums ) {
			
			System.out.println(m);
		}
		
		
		
	}
	
}
