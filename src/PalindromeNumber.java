public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String toCheck = String.valueOf(x);
        int left = 0;
        int right = toCheck.length()-1;
        while(left < right) {
            String temp1 = String.valueOf(toCheck.charAt(left));
            String temp2 = String.valueOf(toCheck.charAt(right));
            if(!temp1.equals(temp2)) return false;
            left++;
            right--;
        }

        return true;
    }
}
