
import java.util.List;


/**
 *
 * @author IdeaPad
 */
public class MyWine implements IWine {

    @Override
    public String f1(List<Wine> t) {
        int largest = 0;
        String largestString = "Not found";
        for (Wine wine : t) {
            if (wine.getYear() % 3 == 0) {
                if (wine.getBrand().length() > largest) {
                    largest = wine.getBrand().length();
                    largestString = wine.getBrand();
                }
            }
        }

        return largestString;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void f2(List<Wine> t) {
        if (t.isEmpty()) {
            return;
        } 
        
        for (Wine wine : t) {
            if (isPrime(wine.getBrand().length())) {
                String yearString = String.valueOf(wine.getYear());
                char firstChar = yearString.charAt(0);

                wine.setBrand("PRE" + firstChar);
            }
        }
    }

    @Override
    public void f3(List<Wine> t) {
        int maxEvenYear = 0;
        boolean foundEven = false;

        for (Wine wine : t) {
            if (wine.getYear() % 2 == 0) {
                if (!foundEven) {
                    maxEvenYear = wine.getYear();
                    foundEven = true;
                }
                if (wine.getYear() > maxEvenYear) {
                    maxEvenYear = wine.getYear();
                }
            }
        }
        if (!foundEven) {
            return;
        }

        int finalMaxEvenYear = maxEvenYear;
        t.removeIf(wine -> {
            String brand = wine.getBrand();

            boolean startsWithCapital = (brand != null && !brand.isEmpty() && Character.isUpperCase(brand.charAt(0)));
            boolean yearMatches = (wine.getYear() == finalMaxEvenYear);

            return startsWithCapital && yearMatches;
        });
    }
}
