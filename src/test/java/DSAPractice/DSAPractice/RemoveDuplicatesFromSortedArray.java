package DSAPractice.DSAPractice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
	public RemoveDuplicatesFromSortedArray(int[] arr) {
		List<Integer> list = new ArrayList<Integer>(); 
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		int arr[] = {11,22,22,33,333,333,333,44,44,444,444,55,66,77,8888,8888};
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray(arr);	
	}
}
