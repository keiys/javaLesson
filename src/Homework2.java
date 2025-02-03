public class Homework2 {
    public static void main(String[] args) {

        //211
        /*int[] array = {5, -3, 7, -15, -2, 6, 20, 12};
        int k = 0;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                k++;
                s += array[i];
            }
        }
        System.out.println(s/k);*/

        //214
        /*int[] array = {5, -3, 7, -15, -3, 6, 20, 12};
        int k = 0;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                k++;
                s += array[i];
            }
        }
        System.out.println(s/k);*/

        //215
        /*int[] array = {5, -3, 7, -15, -3, 6, 20, 12};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);*/

        //216
        /*int[] array = {5, -3, 7, -15, -3, 6, 20, 12};
        int s = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                s *= array[i];
            }
        }
        System.out.println(s);*/

        //219
        /*int[] array = {5, -3, 7, -15, -3, 6, 20, 12};
        int k = 3;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                s++;
            }
        }
        System.out.println(s);*/

        //220
        /*int[] array = {5, -3, 7, -15, 0, -1, 20, 12};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            }
        }
        System.out.println("positive items count is: " + positive);
        System.out.println("negative items count is: " + negative);*/

        //227
        /*int[] array = {5, -3, 7, -15, -2, 6, 20, 12};
        int k = 3;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                count++;
                sum += array[i];
            }
        }
        System.out.println(sum/count);*/

        //228
        /*int [] array = {5, -3, 7, -15, -2, 6, 20, 12};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);*/

        //229
        /*int[] array = {5, -3, 7, -15, -2, 6, 20, 12};
        int k = 3;
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                mul *= array[i];
            }
        }
        System.out.println(mul);*/

        //232
        /*int[] array = {4, -3, 7, -15, -2, 5, 20, 12};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);*/

        //233
        /*int[] array = {4, -3, 7, -15, -2, 5, 20, 12};
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                mul *= array[i];
            }
        }
        System.out.println("even numbers sum: " + sum);
        System.out.println("even numbers mul: " + mul);*/

        //234
        /*int[] array = {4, -3, 7, -15, -2, 5, 20, 12};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum/count);*/

        //236
        /*int[] array = {4, -3, 7, -15, -2, 5, 20, 12};
        int count = 0;
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
                mul *= array[i];
            }
        }
        System.out.println("odd numbers count: " + count);
        System.out.println("odd numbers mul: " + mul);*/

        //238
        /*int[] array = {4, -3, 7, -15, -2, 5, 20, 12};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum/count);*/

        //240
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);*/

        //241
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int k = 5;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);*/

        //244
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 5 == 2) {
                mul *= array[i];
            }
        }
        System.out.println(mul);*/

        //248
        /*int [] array = {5, 8, 9, 10, 4, 11, -7, 2, 15};
        int k = 4;  //  0  1  2  3   4  5    6  7  8
        int sum = 0;
        for (int i=0; i < array.length; i++){
            int a = array[i] + i;
            if((a*a) % k == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);*/

        //251
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);*/

        //252
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);*/

        //253
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + max);*/

        //254
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min * max);*/

        //255
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax + max);*/

        //256
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, -14};
        int min  = array[0];
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMin + min);*/

        //257
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, 21};
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);*/

        //258
        /*int[] array = {4, -3, 7, -15, 21, 5, 20, 21};
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);*/

        //259
        /*int[] array = {4, -3, 7, -15, 21, -15, 20, 1};
        int min = array[0];
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMin);*/

        //260
        /*int[] array = {4, -3, 7, -15, 21, -15, 20, 1};
        int min = array[0];
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMin);*/

    }
}
