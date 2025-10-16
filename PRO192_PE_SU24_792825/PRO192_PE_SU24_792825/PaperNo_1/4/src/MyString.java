
/**
 *
 * @author IdeaPad
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        if (str.isEmpty() || str.length() == 0) {
            return 0;
        }
        int sum = 0;
        String[] strNum = str.split("\\D+");

        for (int i = 0; i < strNum.length; i++) {
            if (!strNum[i].isEmpty()) {
                int number = Integer.parseInt(strNum[i]);
                if (number % 2 != 0) {
                    sum += number;
                }
            }
        }
        return sum;
    }
    
    @Override
    public String f2(String str) {
        if (str == null || str.isEmpty() ) {
            return "";
        }
        
        String[] words = str.split("\\s+");
        if (words.length == 0 || words.length == 1 && words[0].isEmpty()) {
            return "";
        }
        int maxLength = words[0].length();
        int maxIndex = 0;
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxIndex = i;
            }
        }
        
        String strReverse = new StringBuilder(words[maxIndex]).reverse().toString();
        words[maxIndex] = strReverse;
        return String.join(" ", words); //String.join để gán các elements trong một array được ngăn cách bằng
        //cách truyền ký tự muốn truyền vào ở delimiter
    }
    
}
