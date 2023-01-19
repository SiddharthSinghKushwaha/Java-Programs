import java.util.*;

class MissingNumber {
	public static void main(String[] args) {
		int arr[] = { 0,3,2,1 };
		int ans = cyclicsort(arr);
		System.out.println("Missing Number is: "+ ans);
	}

	static int cyclicsort(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			} 
			else
				i++;
		}
		
		for(int j = 0; j < arr.length ; j++){
			if(arr[j] != j)
				return j;
		}
		return arr.length;
	}
}