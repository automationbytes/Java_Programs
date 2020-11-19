package Java_Programs;

import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter A");
		int a = input.nextInt();
	
	System.out.println("Enter B");
		int b = input.nextInt();
	
	System.out.println("Enter C");
		int c = input.nextInt();
	
	
	
	if (a>b && a>c) {
		System.out.println("A is greater");
	}
	
	else if(b>a && b>c) {
		System.out.println("B is greater");
	}
	else {
		System.out.println("C is greater");
	}

		
	}

}
