import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Homework11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(-42, 6, 0, 55, 8, -20, 55, -3, 7, -42, -14, 18, -8));

        //211
//        int sum = 0;
//        int count = 0;
//        for (int x: list) {
//            if(x > 0) {
//                sum += x;
//                count++;
//            }
//        }
//        System.out.println(sum / count);

        //214
//        int sum = 0;
//        int count = 0;
//        for (int x: list) {
//            if(x < 0) {
//                sum += x;
//                count++;
//            }
//        }
//        System.out.println(sum / count);

        //215
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (i % 2 == 0) {
//                sum += list.get(i);
//            }
//        }
//        System.out.println(sum);

        //216
//        int sub = 1;
//        for (int i = 0; i < list.size(); i++) {
//            if (i % 2 == 0) {
//                sub *= list.get(i);
//            }
//        }
//        System.out.println(sub);

        //217
//        int sub = 1;
//        for (int i = 0; i < list.size(); i++) {
//            if (i % 2 != 0) {
//                int qarakusi = list.get(i) * list.get(i);
//                sub *= qarakusi;
//            }
//        }
//        System.out.println(sub);


        //219
//        int k = 3;
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if(i % k == 0){
//                count++;
//            }
//        }
//        System.out.println(count);

        //220
//        int drakanCount = 0;
//        int bacasakanCount = 0;
//        for (int x: list) {
//            if(x > 0){
//                drakanCount++;
//            }else if(x < 0){
//                bacasakanCount++;
//            }
//        }
//        System.out.println("drakan: " + drakanCount);
//        System.out.println("bacasakan: " + bacasakanCount);

        //221
//        int a = 10;
//        int b = 60;
//        int sum = 0;
//        for (int x: list) {
//            if (x >= a && x <= b) {
//                sum += x;
//            }
//        }
//        System.out.println(sum);

        //222
//        int c = - 10;
//        int d = 30;
//        int sub = 1;
//        for (int x: list) {
//            if (x >= c && x < d) {
//                sub *= x;
//            }
//        }
//        System.out.println(sub);

        //223
//        int a = - 10;
//        int b = 30;
//        int count = 0;
//        for (int x: list) {
//            if (x > a && x < b) {
//                count ++;
//            }
//        }
//        System.out.println(count);

        //227
//        int k = 3;
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (i % k == 0) {
//                sum += list.get(i);
//                count++;
//            }
//        }
//        System.out.println(sum / count);

        //228
//        int k = 5;
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (i % k == 0) {
//                sum += list.get(i);
//            }
//        }
//        System.out.println(sum);

        //229
//        int sub = 1;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) - i > 0) {
//                sub *= list.get(i);
//            }
//        }
//        System.out.println(sub);

        //231
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                int qarakusi = list.get(i) * list.get(i);
//                sum += qarakusi;
//            }
//        }
//        System.out.println(sum);

        //232
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        //233
//        int sum = 0;
//        int sub = 1;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                sum += list.get(i);
//                sub *= list.get(i);
//            }
//        }
//        System.out.println("sum = " + sum);
//        System.out.println("sub = " + sub);

        //234
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) % 2 != 0){
//                sum += list.get(i);
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        //236
//        int count = 0;
//        int sub = 1;
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) % 2 != 0){
//                sub *= list.get(i);
//                count++;
//            }
//        }
//        System.out.println("count = " + count);
//        System.out.println("sub = " + sub);

        //237
//        int count = 0;
//        for (int x: list) {
//            if(x == 0){
//                count++;
//            }
//        }
//        System.out.println(count);

        //238
//        int sum = 0;
//        int count = 0;
//        for (int i : list) {
//            if( i % 3 == 0){
//                sum += i;
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        //240
//        int counter = 0;
//        for(int i : list) {
//            if (i % 7 == 0){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        //241
//        int sum = 0;
//        int k = 5;
//        for (int i: list) {
//            if(i % k == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //242
//        int sub = 1;
//        int m = 8;
//        for(int i: list) {
//            if(i % m == 0) {
//                sub *= i;
//            }
//        }
//        System.out.println(sub);

        //243
//        int counter = 0;
//        int t = 4;
//        for (int i: list) {
//            if(i % t == 0){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        //244
//        int sub = 1;
//        for (int i: list) {
//            if(i % 5 == 2){
//                sub *= i;
//            }
//        }
//        System.out.println(sub);

        //245
//        int sum =0;
//        for (int i = 0; i < list.size(); i++) {
//            if((list.get(i) + i) % 3 == 0){
//                int qarakusi = list.get(i) * list.get(i);
//                sum += qarakusi;
//            }
//        }
//        System.out.println(sum);

        //248
//        int sum = 0;
//        int k = 9;
//        for (int i = 0; i < list.size(); i++) {
//            int num = (list.get(i) + i) * (list.get(i) + i);
//            if(num % k == 0){
//                sum += list.get(i);
//            }
//        }
//        System.out.println(sum);

        //250
//        int sub = 1;
//        for (int i = 0; i < list.size(); i++) {
//            if((list.get(i) * i) % 3 == 2) {
//                int qarakusi = list.get(i) + list.get(i);
//                sub *= qarakusi;
//            }
//        }
//        System.out.println(sub);

        //251
//        System.out.println(Collections.max(list));

        //252
//        System.out.println(Collections.min(list));

        //253
//        System.out.println(Collections.max(list) + Collections.min(list));

        //254
//        System.out.println(Collections.max(list) * Collections.min(list));

        //255
//        int max = Collections.max(list);
//        int indexOfMax = list.indexOf(max);
//        System.out.println(max + indexOfMax);

        //256
//        int min = Collections.min(list);
//        int indexOfMin = list.indexOf(min);
//        System.out.println(min + indexOfMin);

        //257
//        int max = Collections.max(list);
//        System.out.println(list.indexOf(max));

        //258
//        int max = Collections.max(list);
//        System.out.println(list.lastIndexOf(max));

        //259
//        int min = Collections.min(list);
//        System.out.println(list.indexOf(min));

        //260
//        int min = Collections.min(list);
//        System.out.println(list.lastIndexOf(min));




    }
}
