class MissingPanagram
{
    // Complete the function
    // str: input string
    public static String missingPanagram(String str)
    {
        // Find and return the missing characters
        // to complete Panagram string
        str=str.toLowerCase();
        String result="";
        for(char ch='a';ch<='z';ch++)
        {
            if((str.indexOf(ch))==-1)
                result+=ch;
        }
        if(result.length()==0)
            return "-1";
        else
         return result;
    }
	public static void main(String args[])
	{
		String store=missingPanagram("siddahrth");
		System.out.println("Your missing characters are "+store);
	}
}