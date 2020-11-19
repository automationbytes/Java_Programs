package Java_Programs;

public class arrays_exmp {
	
	public static void main(String[] args) {
		
		int[] myarr = new int[3];
		myarr[0]= 1;
		myarr[1]=2;
		myarr[2]=3;
		//
		
		int myarr1[] = {1,2,3};
		
		for (int m: myarr1) {
			System.out.println(m);
		}
		
		for (int i = 0;i<myarr.length;i++ ) {
			System.out.println(myarr[i]);
		}
		
	}

}
