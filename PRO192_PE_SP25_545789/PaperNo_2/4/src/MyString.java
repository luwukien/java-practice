
import java.util.ArrayList;

public class MyString implements IString {

    private boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        return new StringBuilder(word)
                .reverse()
                .toString()
                .equalsIgnoreCase(word);

    }

    public int f1(String str) {
        String[] words = str.split("\\s+");;
        ArrayList<String> palindromeWords = new ArrayList<>();


        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }
        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < palindromeWords.size(); i++) {
            if (palindromeWords.get(i).length() > maxLength) {
                maxLength = palindromeWords.get(i).length();
            }
        }

        for (String paString : palindromeWords) {
            if (paString.length() == maxLength) {
                count++;
            }
        }
        return count;
    }

    public String f2(String str) {
        String[] words = str.split("\\s+");

        ArrayList<String> palindromeWords = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }

        if (palindromeWords.isEmpty()) {
            return null;
        }

        int minLength = palindromeWords.get(0).length();
        for (int i = 0; i < palindromeWords.size(); i++) {
            if (palindromeWords.get(i).length() < minLength) {
                minLength = palindromeWords.get(i).length();
            }
        }

        for (String pWord : palindromeWords) {
            if (pWord.length() == minLength) {
                return pWord;
            }
        }
        return "";
    }
}
