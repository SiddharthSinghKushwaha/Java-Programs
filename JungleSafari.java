import java.util.*;
class JungleSafari
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the voices you heard with space between them:\n");
		String voices=ob.nextLine();
		String voicesDivide[];
		voicesDivide= voices.split(" ");
		System.out.println();
		for(int i=0;i< voicesDivide.length; i++)
		{
			if((voicesDivide[i].compareTo("Grr"))==0)
				System.out.print("Lion ");
			else if((voicesDivide[i].compareTo("Rawr"))==0)
				System.out.print("Tiger ");
			else if((voicesDivide[i].compareTo("Ssss"))==0)
				System.out.print("Snake ");
			else if((voicesDivide[i].compareTo("Chirp"))==0)
				System.out.print("Bird ");
			else
				System.out.print("   ");
		}
	}
}