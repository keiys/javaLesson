import java.util.*;

public class Hmw1 {
    public static void main(String[] args) {
        HashSet<Integer> n1 = new HashSet<>();
        LinkedList<Integer> n2 = new LinkedList<>();
        ArrayList<Integer> n3 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 1500000; i++) {
            n1.add(r.nextInt());
            n2.add(r.nextInt());
            n3.add(r.nextInt());
        }
        System.out.println("--------------HashSet----------------");
        compareSpeed(n1);
        System.out.println("--------------LinkedList----------------");
        compareSpeed(n2);
        System.out.println("--------------ArrayList----------------");
        compareSpeed(n3);

    }

    public static void compareSpeed(Collection<Integer> c){
        long startTime = System.currentTimeMillis();
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println((System.currentTimeMillis()-startTime)/1000.0);

    }
}
