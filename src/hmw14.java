import java.util.ArrayList;
import java.util.List;

public class hmw14 {
    public static void main(String[] args) {

        String a = "agcd";
        String b = "abc";
        if (a.length() == b.length() + 1) {
            ArrayList<Integer> result = findRemovableIndices(a, b);
            System.out.println(result.isEmpty()? "there is no possible way" : result );
        }else{
            System.out.println("the first string is longer than one symbol from second string");
        }
    }

    public static ArrayList<Integer> findRemovableIndices (String longer, String shorter){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < longer.length(); i++){
            StringBuilder longerClone = new StringBuilder(longer);
            longerClone = longerClone.deleteCharAt(i);
            if(longerClone.toString().equals(shorter)){
                list.add(i);
            }
        }
        return (ArrayList<Integer>) list;
    }

}
