
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MyFurniture implements IFurniture {

    @Override
    public int f1(List<Furniture> t) {
        int sum = 0;
        for (Furniture furniture : t) {
            int length = furniture.getName().length();
            if (furniture.getName().charAt(length) != 'n') {
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
        
        int j = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getName().charAt(0))) {
                t.set(i, listCanSort.get(j));
                j++;
            }
        }
    }
}
