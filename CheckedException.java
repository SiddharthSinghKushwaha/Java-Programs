import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CheckedException
{
	public static void  main(String[] args)
	throws IOException/* we can write throws IOException here 
	inplace of the use of try, throw, catch, finally*/
	{
		FileReader file=new FileReader("C:\\Users\\OCAC\\my_work\\check.txt");
	    BufferedReader br=new BufferedReader(file);
		String s[];
	    for(int c=0;c<1;c++)
		{
			s=br.readLine().split(",");
			for(char ch='a'; ch<='z';ch++)
			{
				boolean count=true;
				int temp=0;
				for(int i=0;i<s.length;i++)
				{
					System.out.print(s[i]+" ");
					int value1=ch;
					temp++;
					System.out.println(value1);
					System.out.println(Integer.parseInt(s[i]));
					if(value1 == Integer.parseInt(s[i]))
						System.out.print(ch);
					if(temp==s.length)
						count = false;
				}
				if(count==false)
					break;
			}
		}	    
	}
		
}