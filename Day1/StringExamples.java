package Java_Programs;

public class StringExamples {
	
	public static void main(String[] args) {
		
		String s1 = "Hello World"; // string pool
		String s2 = "Hello";
		String s3 = new String("Hello").intern(); //string pool
		String s4 = new String("Hello");// heap memory
		System.out.println(s1.equals(s3));
		System.out.println(s2 == s3);
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.substring(5));
		

		System.out.println(s1.substring(5,9));
		
		System.out.println(s1.contains("H1"));
		
		String q = "Hi";
		String w = "2020";
		System.out.println(q+" "+w);
		String strjoin = String.join(" ", q,w);
		System.out.println(strjoin);
		
		String Estr = "";
		System.out.println(Estr.isBlank());
		System.out.println(Estr.isEmpty());
		System.out.println(w.replace("2020", "2021"));
		
		String spStr = "Hi How are you";
		String[] strarr = spStr.split(" ");
		System.out.println(strarr[1]);
		for (String S: strarr) {
			System.out.println(S);
		}
		
		System.out.println(w.indexOf("2"));
		
		
		//equals
		//equalsignore case
		//content equals
		//content equal ignore case
		//compareto // -1,0,1
		String a = "A";
		String b = "C";
		System.out.println(b.compareTo(a));
		
		String str1 = "          Hi             ";
		System.out.println(str1);
		System.out.println(str1.trim());
		System.out.println(str1.strip());
		System.out.println(str1.stripLeading());
		System.out.println(str1.stripTrailing());
		
		
		
	}

}
