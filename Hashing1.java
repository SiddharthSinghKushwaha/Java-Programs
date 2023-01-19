// You are given an Array contains Positive and negative element in the range -MAX to +MAX

public class Hashing1<global> {
	static int MAX=100;
	static boolean has[][]= new boolean[MAX][2];
	
	static void insert(int arr[],int n) {
		for(int i= 0;i<n;i++) {
			if(arr[i] >= 0) {
				has[arr[i]][0] = true;
			}
			else {
				has[Math.abs(arr[i])][1] = true;
			}
			
		}
	}
	
	static boolean search(int x) {
		if(x >= 0) {
			if(has[x][0] == true) {
				return true;
			}
			else {
				return false;
			}
		} else {
			x = Math.abs(x);
			if(has[x][0] == true) {
				return true;
			}
			else {
				return false;
			}
		}
	}


	public static void main(String args[]) {
		int arr[] = {-1,9,2,-5,3,1};
		int n = arr.length;
		insert(arr,n);
		int find = -3;
		if(search(find)) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
	}
	}