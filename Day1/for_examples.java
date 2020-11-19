package Java_Programs;

public class for_examples {
	
	public static void main(String[] args) {
		//to print only odd numbers
		System.out.println("Odd");
		
		for(int i = 0; i<10; i ++) {
			if (!(i%2 ==0))
			{
				System.out.println(i);
			}
		}
		System.out.println("Even");
		
		for(int i = 0; i<10; i ++) {
			if ((i%2 ==0))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
