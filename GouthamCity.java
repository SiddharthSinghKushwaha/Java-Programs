import java.util.*;
class GouthamCity
{
	public static void main(String args[])
	{
		Scanner on=new Scanner(System.in);
		int val=4;
		switch(val)
		{
			case -1: System.out.println("U are beautiful");
			case -2: System.out.println("joke thilla");
			case 3: System.out.println("u are good");
			        break;
			case 4: System.out.println("u can\0 do it");
            case 5: System.out.println("try again");
			default:
			        System.out.println("i am mental");
     	}
		int a=10,b=15,c=-5;
		int d= ++a + b-- + ++c;
		a=10;b=15;c=-5;
		int e= --a + ++b - --c;
		a=10;b=15;c=-5;
		int f= ++c + c++ + ++a + a++ + ++b + b++;
		a=10;b=15;c=-5;
		int g= --a - --c + --b;
		System.out.println("\n"+ d +" "+ e+ " " +f + " "+ g);  //22 31 46 29
		System.out.print("Total number of Criminals reported\n");
		int noc=on.nextInt(); // noc- Number Of Criminals
		if(noc<5)
			System.out.println("\'I got this!\'");
		else if(noc>=5 && noc<=10)
		System.out.println("\'Help me Batman\'");
		else if(noc>10)
			System.out.println("\'Good Luck out there!\'");
	}
}