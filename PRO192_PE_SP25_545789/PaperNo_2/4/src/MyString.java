
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int[] count = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count[ch - '0']++;
            }
        }
        int maxFre = 0;
        int maxNum = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxFre || (count[i] == maxFre && i > maxNum)) {
                maxFre = count[i];
                maxNum = i;
            } 
        }
        
        if (maxFre == 0) {
            return -1;
        } 
        return maxNum;
    }

    @Override
    public String f2(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                result.append(ch);
            } else {
                int start = i;
                int end = i;
                for (int j = i; j < str.length(); j++) {
                     if (Character.isDigit(str.charAt(j))) {
                         end = j;
                     } else {
                         break;
                     }
                }
                result.append(new StringBuilder(str.substring(start, end + 1)).reverse());
                i = end;
            }
        }
        return result.toString();
    }

}
