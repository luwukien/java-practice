
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyFurniture implements IFurniture {

    @Override
    public int f1(List<Furniture> t) {
        int sum = 0;
        for (Furniture furniture : t) {
            int length = furniture.getName().length();
            if (furniture.getName().charAt((length - 1)) != 'n') { //hoặc có thể viết là !furniture.getName().endsWith("n")
                sum += furniture.getPrice();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Furniture> t) {
        List<Furniture> listCanSort = new ArrayList<>();

        for (Furniture furniture : t) {
            if (Character.isDigit(furniture.getName().charAt(0))) {
                listCanSort.add(furniture);
            }
        }
        Collections.sort(listCanSort, (f1, f2) -> Integer.compare(f2.getPrice(), f1.getPrice()));
        // hoặc có thể viết thành Collections.sort(listCanSort, Comparator.comparing(Furniture::getPrice).reversed());
        int j = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getName().charAt(0))) {
                t.set(i, listCanSort.get(j));
                j++;
            }
        }
    }

    @Override
    public void f3(List<Furniture> t) {
        List<Furniture> chooseEle = new ArrayList<>();
        double sum = 0;
        for (Furniture furniture : t) {
            sum += furniture.getPrice();
        }

        double avgPrice = sum / (t.size());

        for (Furniture furniture : t) {
            if (Character.isDigit(furniture.getName().charAt(0)) && furniture.getPrice() > avgPrice) {
                chooseEle.add(furniture);
            }
        }

        t.removeAll(chooseEle);
    }
}
