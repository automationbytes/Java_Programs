package Java_Programs;

import java.util.ArrayList;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPresnt = false;
		int[] arr = {1,2,3,4,5,6,1,2,3,1,2,3};
		ArrayList<Integer> AL = new ArrayList<Integer>();

		for (int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if (arr[i] == arr[j]) 
					if(AL.contains(arr[i])) {
						break;
					}
					else {
						AL.add(arr[i]);
						
						isPresnt = true;
						
					}



			}
		}
		if (isPresnt == true) {
			System.out.println(AL);
		}
	}

}
