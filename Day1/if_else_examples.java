package Java_Programs;

public class if_else_examples {
	public static void main(String[] args) {


		int age = 80;
		// age < 10 = Kid
		// age < 20 = boy
		//age <40 = men
		//age < 60 = uncle

		if (age > 60) {
			System.out.println("Uncle");
		}
		else if(age > 40) {
			System.out.println("Men");
		}
		else if(age > 20) {
			System.out.println("Boy");
		}
		else {
			System.out.println("Kid");
		}



		int marks = 7;

		//grade a - greater than 80
		//grade b - grater than 60 
		//grade c- greater than 40
		//else - fail

		if (marks > 80) {
			System.out.println("Grade A");

		}
		else if (marks > 60) {
			System.out.println("Grade B");

		} else if(marks > 40) {
			System.out.println("Grade C");

		} else {
			System.out.println("Fail");
		}
	}

}
