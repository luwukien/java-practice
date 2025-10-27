
/**
 *
 * @author IdeaPad
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        if (str == null || str.isEmpty() || str.length() == 0) {
            return -1;
        }

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                freq[c - 'A']++;
            }
        }
        int maxFreq = 0;
        int chosen = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                chosen = i;
            }
        }

        if (maxFreq == 0) {
            return -1;
        }
        return 'A' + chosen;
    }

    @Override
    public String f2(String str) {
        if (str == null || str.isEmpty() || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                temp.append(str.charAt(i));
            } else {
                if (temp.length() > 0) {
                    result.append(temp.reverse());
                    temp.setLength(0); //Dùng cái này để clear temp 
                }
                result.append(str.charAt(i));
            }
        }
        //Dùng cái này để xử lý nhóm chữ thường cuối cùng vẫn đang ở trong temp mà lần lặp if đầu tiên nó vẫn đang gán vào
        if (temp.length() > 0) {
            result.append(temp.reverse());
        }

        return result.toString();
    }
}
