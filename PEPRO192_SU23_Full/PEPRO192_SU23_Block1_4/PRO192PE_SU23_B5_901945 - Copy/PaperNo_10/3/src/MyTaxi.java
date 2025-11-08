
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author IdeaPad
 */
public class MyTaxi implements ITaxi {

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
    public int f1(List<Taxi> t) {
        int total = 0;
        for (Taxi taxi : t) {
            if (taxi.getDriver().length() >= 2 && !isPalindrome(taxi.getDriver())) {
                total += taxi.getSalary();
            }
        }
        return total;
    }

    @Override
    public void f2(List<Taxi> t) {
        ArrayList<Taxi> toRemove = new ArrayList<>();

        for (Taxi taxi : t) {
            String stringSalary = String.valueOf(taxi.getSalary()).trim();
            if (stringSalary.length() == 2) {
                char ch1 = stringSalary.charAt(0);
                char ch2 = stringSalary.charAt(1);
                int firstDigit = Integer.parseInt(String.valueOf(ch1));
                int secondDigit = Integer.parseInt(String.valueOf(ch2));
                if (firstDigit % 2 == 0 && secondDigit % 2 == 0) {
                    toRemove.add(taxi);
                    break;
                }
            }
        }
        t.removeAll(toRemove);
    }

    @Override
    public void f3(List<Taxi> t) {

        Comparator<Taxi> finalCompare
                = Comparator.comparingInt(Taxi::getSalary)
                        .thenComparing(Taxi::getDriver, Comparator.reverseOrder());

        Collections.sort(t, finalCompare);
    }

}
