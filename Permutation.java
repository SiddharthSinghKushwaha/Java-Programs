import java.util.*;
class Permutation
{
	public static void main(String args[])
	{
		String str="ABC";
		int n=str.length();
		Permutation p=new Permutation();
		p.permutate(str,0,n-1);
	}
	private void permutate(String str,int l,int r)
	{
		if(l==r)
			System.out.println(str);
		else
		{
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				permutate(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	public String swap(String a,int i,int j)
	{
		char temp;
		char charArray[]=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
}
// for a string to be permutate
/*
public ArrayList<String> al1 = new ArrayList<>();
    public void permutation(String s)
    {
        //Your code here
        int l =0,r=s.length()-1;
        ArrayList<String> al = getPerm(s,l,r);
        Collections.sort(al);
        for(String s1:al)
            System.out.print(s1+" ");
    }
    public String swap(String s,int i,int j)
    {
        char[] ch = s.toCharArray();
        char t = ch[i];
        ch[i] = ch[j];
        ch[j]= t;
        return String.valueOf(ch);
    }
    public ArrayList<String> getPerm(String s,int l,int r)
    {
        if(l == r)
        {
            al1.add(s);
        }
        else {
        for(int i=l;i<=r;i++)
        {
                s = swap(s,l,i);
                getPerm(s,l+1,r);
                s = swap(s,l,i);
        } }
        return al1;
    }
*/
