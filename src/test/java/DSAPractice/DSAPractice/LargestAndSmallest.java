package DSAPractice.DSAPractice;

public class LargestAndSmallest {

	public static void LargestAndSmallest(int[] arr) {
		int min ; int max ; 
		min = max = arr[0]; 
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println(max+"  "+min); 
	}
	public static void LargestAndSmallestWithSorting(int[] arr) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,66,22,44,55,100};
		LargestAndSmallest(arr);
		LargestAndSmallestWithSorting(arr);
	}
}
