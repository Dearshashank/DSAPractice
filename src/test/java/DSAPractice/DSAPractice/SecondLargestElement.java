package DSAPractice.DSAPractice;

public class SecondLargestElement {

	public static void SecondLargestElement(int[] arr) {
		int max1 ; int max2 ; 
		max1= max2 = 0 ;
		for(int i : arr) {
			if(i > max1) {
				max2 = max1 ; 
				max1 = i ; 
			}
		}
		System.out.println(max1+"  "+max2);
	}

	public static void main(String[] args) {
		int arr[] = {11,66,22,44,55,100};
		SecondLargestElement(arr);
		
	}

}
