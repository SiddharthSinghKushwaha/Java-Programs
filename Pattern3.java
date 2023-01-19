public class Pattern3{
	public static void main(String args[]){
		pattern(5);
	}
	static void pattern(int n){
		for(int r =1; r<= 5; r++){
			int space = n-r;
			for(int i=1; i<=space; i++)
				System.out.print("  ");
			
			for(int c=r; c>= 1; c--)
				System.out.print(c + " ");
			
			for(int c = 2; c <= r; c++)
				System.out.print(c + " ");
			
			System.out.println();
		}
	}
}