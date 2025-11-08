
/**
 *
 * @author IdeaPad
 */
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

    @Override
    public int f1(String str) {
        if (str == null) {
            return 0;
        }
        String[] list = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            int length = list[i].length();
            if (length >= 2 && isPalindrome(list[i])) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String f2(String str) {
        if (str == null) {
            return null;
        }
        String[] list = str.split("\\s+");
        /*
        int max = list[0].length();

        for (int i = 0; i < list.length; i++) {
            int length = list[i].length();
            if (length > max) {
                max = length;
            }
        }

        for (int i = 0; i < list.length; i++) {
            int length = list[i].length();
            if (length == max) {
                return list[i];
            }
        }

        return list[0];
        */
        String longest = "";
        for (String word : list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

}
