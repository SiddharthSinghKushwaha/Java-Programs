import java.util.*;
public class CaesarCipherProgram 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println("Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             // Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
        }
        System.out.println(" ciphertext : " + ciphertext);
		
	    System.out.println(" Input the ciphertext message : ");
        String ciphertext2 = sc.nextLine();
		ciphertext2 = sc.next();
        System.out.println(" Enter the shift value : ");
        int shift2 = sc.nextInt();
        String decryptMessage = "";
        for(int i=0; i < ciphertext2.length();i++)  

        {
            // Shift one character at a time
            char alphabet2 = ciphertext2.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet2 >= 'a' && alphabet2 <= 'z')
            {
                // shift alphabet
                alphabet2 = (char) (alphabet2 - shift2);
            
                // shift alphabet lesser than 'a'
                if(alphabet2 < 'a') {
                    //reshift to starting position 
                    alphabet2 = (char) (alphabet2-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet2;
            }    
                // if alphabet lies between A and Z
            else if(alphabet2 >= 'A' && alphabet2 <= 'Z')
            {
             // shift alphabet
                alphabet2 = (char) (alphabet2 - shift2);
                
                //shift alphabet lesser than 'A'
                if (alphabet2 < 'A') {
                    // reshift to starting position 
                    alphabet2 = (char) (alphabet2-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet2;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet2;            
            } 
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}