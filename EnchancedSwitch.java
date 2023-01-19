import java.util.*;
class EnchancedSwitch{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter your day number: ");
		int d = ob.nextInt();
		switch(d){
			case 1: System.out.println("\nWeekday");
				switch(d){
					case 1: System.out.println("Monday");
					break;
				}
				break;
			case 6: System.out.println("\nWeekend");
		}
	}
}