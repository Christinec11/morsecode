import java.io.IOException;

import java.util.*;

public class morsecode
{
    public static void main(String[] args) throws IOException
    {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
    "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
    "9", "0"};

    String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
    "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
    "-....", "--...", "---..", "----.", "-----"};
        
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    ArrayList<String> store = new ArrayList<String>();
    morse(input, store, "", morseCodes, alphabet);

    System.out.println(store);
    }

    public static void morse(String input, ArrayList<String> store, String active, String[] morseCodes, String[] alphabet)
    {
       //int length = 36;
        if(input.length() == 0) 
        {
        store.add(active);
        return;
        }
        for(int i = 1; i <= input.length(); i++)
        {
        String word = input.substring(0, i);
        String letter = translate(word, morseCodes, alphabet);
            if(letter != null)
            {
                morse(input.substring(i), store, active + letter, morseCodes, alphabet);
            }
        }
    }

    public static String translate(String word, String[] morseCodes, String[] alphabet) 
    {
        for (int i = 0; i < morseCodes.length; i++) 
        {
            if (word.equals(morseCodes[i]))
             {
                return alphabet[i];
            }
        }
                return null;
    }   
     
}

 /* morseCodes[i] = alphabet[i]
    
    String[] translate = new String[36];

    int index =  0;
    index , array length
    //how do i interpret substring into alphabet
    //how do i d if successful
    //is letter an array?
    
    
    substring( 0,i )//look at first block, then the get bigger slowly*/
