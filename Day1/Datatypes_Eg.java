package Java_Programs;

public class Datatypes_Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//automatic conversion
		//widening casting
		byte myByte = 100;
		short myShort = myByte;
		
		
		//manual conversion
		//narrowing casting
		short Short = -130;
		byte Byte = (byte) Short;
		System.out.println(Byte);
		
		char c = 'A';
		int cAscii = c;
		System.out.println(cAscii);
		float fAscii = c;
		System.out.println(fAscii);
		
		
		short a = 10;
		short b = 120;
		short c1 = (short) (a+b);
		System.out.println(c1);
		
		
		
	}

}
