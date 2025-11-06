
import java.util.ArrayList;

public class MyString implements IString {

    @Override
    public int f1(String str) {
        ArrayList<String> listNumber = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int start = i;
                int end = 0;
                String num = "";

                for (int j = start; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) {
                        num += str.charAt(j);
                        end = j;
                    } else {
                        break;
                    }
                }
                listNumber.add(num);
                i = end;
            }
        }
        int count = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            int num = Integer.parseInt(listNumber.get(i));
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private int countNumber(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] list = str.split("\\s+");
        int max = 0;
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (countNumber(list[i]) > max) {
                max = countNumber(list[i]);
                index = i;
            }
        }
        if (index == -1) {
            return null;
        }
        list[index] = new StringBuilder(list[index]).reverse().toString();
        String result = "";
        for (int i = 0; i < list.length; i++) {
            result += " " + list[i];
        }
        return result.trim();
    }

}
