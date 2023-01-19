import java.util.*;
class FingerPrinting{
	public static void main(String args[]){
		Random r = new Random();
		int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		String strX = "26";
		String strY = "27";
		boolean check = true;
		
		int p = prime[r.nextInt(prime.length)];
		int hcX = Integer.parseInt(strX) % p;
		int hcY = Integer.parseInt(strY) % p;
		
		if (hcX != hcY){
			System.out.println("The Strings are not equals");
		}
	}
	
}