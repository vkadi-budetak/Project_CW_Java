import java.util.HashMap;

public class Anagram
{
    public static boolean isAnagram(String word, String anagram)
    {
        if(word==null || anagram==null || word.isBlank() || anagram.isBlank()
                || anagram.length() > word.length() || anagram.length()<2)
            return false;

        char[] wordArray = word.toCharArray();
        HashMap<Character, Integer> res = new HashMap<>();
        for(Character ch : wordArray)
        {
            int count = res.getOrDefault(ch, 0);
            res.put(ch, count+1);
        }

        char[] anagramArray = anagram.toCharArray();
        for(Character ch : anagramArray)
        {
            int count = res.getOrDefault(ch, 0);
            if(count == 0)
                return false;
            res.put(ch, count-1);
        }
        return true;
    }
}
