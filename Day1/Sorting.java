package Java_Programs;

public class Sorting {

	//ascending order
	//descending order
	//largest number
	//second..
	//smallest number
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,9,7,4,3};
		int temp = 0;
		for(int i = 0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
//		for(int i = 0;i<arr.length;i++) {
//		}
		System.out.println(arr[arr.length-2]);
		
		
		
	}

}
