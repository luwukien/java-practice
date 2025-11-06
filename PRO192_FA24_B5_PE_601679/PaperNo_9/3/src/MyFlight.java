
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyFlight implements IFlight {

    @Override
    public int f1(List<Flight> t) {
        int sum = 0;
        for (Flight flight : t) {
            if (flight.getCode().charAt(0) != 'V') {
                sum += flight.getDuration();
            }
        }
        return sum;

    }

    @Override
    public void f2(List<Flight> t) {
        ArrayList<Flight> toSort = new ArrayList<>();
        for (Flight flight : t) {
            int lengthCode = flight.getCode().length();
            if (!Character.isDigit(flight.getCode().charAt(lengthCode - 1))) {
                toSort.add(flight);
            }
        }

        Collections.sort(toSort, Comparator.comparing(Flight::getDuration));

        int index = 0;
        for (int i = 0; i < t.size(); i++) {
            int lengthCode = t.get(i).getCode().length();
            if (!Character.isDigit(t.get(i).getCode().charAt(lengthCode - 1))) {
                t.set(i, toSort.get(index));
                index++;
            }
        }
    }

    @Override
    public void f3(List<Flight> t) {
        int avg = 0;
        int sum = 0;
        ArrayList<Flight> listToRemove = new ArrayList<>();
        for (Flight flight : t) {
            sum += flight.getDuration();
            avg = sum / t.size();
        }

        for (Flight flight : t) {
            int lengthCode = flight.getCode().length();
            if (!Character.isDigit(flight.getCode().charAt(lengthCode - 1)) && flight.getDuration() > avg) {
                listToRemove.add(flight);
            }
        }
        t.removeAll(listToRemove);
    }

}
