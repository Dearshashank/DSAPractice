package DSAPractice.DSAPractice;

public class CheckArrayIsSorted {

	public static void CheckArrayIsSorted(int arr[]) {
		for(int i=1 ; i<arr.length;i++) {
		if(arr[i]<arr[i-1]) {
			System.out.println("Not Sorted");
			return ; 
		}
		}
		System.out.println("Array is in Sorted Order");
		return ; 		
	}

	public static void main(String[] args) {
		int arr[] = {11,22,44,55,100};
		CheckArrayIsSorted(arr);
		
	}

}
