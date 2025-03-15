package DSAPractice.DSAPractice;

public class ReverseAnArray {

	public static void ReverseAnArray(int arr[]) {
		int swap = 0 ; 
		for(int i=0 ; i<arr.length/2
				; i++) {
			swap = arr[arr.length-1-i] ; 
			arr[arr.length-1-i] = arr[i] ; 
			arr[i] = swap ; 
		}
		for(int i=0 ; i<arr.length ; i++) {
		System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {111,22,333,44,55};
		ReverseAnArray(arr);
	}

}
