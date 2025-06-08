import java.util.ArrayList;
import java.util.List;

public class hmw13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(5,9 , 8, 7, 18, 20, 3, 11, 32));
        ArrayList<Integer> toRemove = new ArrayList<>();
        list.forEach(e -> {
            if (e % 2 == 1) {
                toRemove.add(e);
            }
        });
        list.removeAll(toRemove);
        System.out.println(list);

    }
}
