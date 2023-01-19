import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String s1,String s2)
    {
        
        // Your code here
        char[] ch1 = s1.toCharArray();
	    char[] ch2 = s2.toCharArray();
		for(int i=0; i<ch1.length; i++)
			System.out.println(ch1[i]);
	
	    Arrays.sort(ch1);
		Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);     
        /*
		if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true; */
    }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.nextLine();
		String s2 = sc.next();
       if(isAnagram(s1,s2))
       {
    	   System.out.println("yes");
    	  
       }
       else
       {
    	   System.out.println("no"); 
       }
        
	}

}
