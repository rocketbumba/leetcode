import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> setA = new HashSet<>();
        int longestSubstring = 0;
        int max = 0;

        int i = 0, j = 0;

        while(i < s.length()) {
            if(!setA.contains(s.charAt(i))) {
                setA.add(s.charAt(i));
                i++;
                if(setA.size() > max) max = setA.size();
            }
            else {
                setA.remove(s.charAt(j++));
            }
        }

        return max;
    }
}
