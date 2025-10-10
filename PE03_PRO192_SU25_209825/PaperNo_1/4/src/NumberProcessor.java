
/**
 *
 * @author IdeaPad
 */
public class NumberProcessor implements INumberUtilities {

    @Override
    public int findFirstEvenNumber(String numbers) {
        String[] numArray = numbers.split("\\s+");
        for (int i = 0; i < numArray.length; i++) {
            try {
                int number = Integer.parseInt(numArray[i]);

                if (number % 2 == 0) {
                    return number;
                }
            } catch (NumberFormatException e) {
            }

        }
        return -1;
    }

    @Override
    public int sumOfDigits(int number) {
        int absNum = Math.abs(number);
        String strNum = String.valueOf(absNum);
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            char aDigit = strNum.charAt(i);
            sum += Character.getNumericValue(aDigit);
        }
        return sum;
    }
}
