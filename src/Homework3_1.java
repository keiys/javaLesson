<<<<<<< HEAD
public class Homework3_1 {
    public static void main(String[] args) {
        //291
        /*int[] array1 = {5, -3, 7, -15, -3, 6, 20, 12};
        int k = 0;
        for (int x: array1) {
            if(x > 0){
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int x: array1) {
            if(x > 0){
                array2[index] = x;
                index++;
            }
        }
        for (int x: array2) {
            System.out.print(x+ " ");
        }*/

        //292
        /*int[] array1 = {5, -3, 7, -15, -3, 6, 21, 12};
        int k = 0;
        for (int x : array1) {
            if (x % 7 == 0) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int x : array1) {
            if (x % 7 == 0) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //293
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 21, 12};
        int k = 0;
        int a = 6;
        int b = 17;
        for (int x : array1) {
            if (a < x && b > x) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int x : array1) {
            if (a < x && b > x) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //294
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 21, 12};
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //295
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 21, 12};
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //296
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 17, 12};
        int count = 0;
        int k = 3;
        for (int x: array1) {
            if (x % k == 2) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            if (x % k == 2) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //297
        /*int[] array1 = {5, -3, -7, -15, -3, 6, 17, 12};
        int count = 0;
        int k = 6;
        for (int x: array1) {
            int absValue = (x < 0) ? -x : x;
            if (absValue > k) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            int absValue = (x < 0) ? -x : x;
            if (absValue > k) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //298
        /*int[] array1 = {5, -3, -7, -15, -3, 6, 8, 12};
        int count = 0;
        for (int x: array1) {
            if (x % 2 == 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            if (x % 2 == 0) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //299
        /*int[] array1 = {5, -3, -7, -15, 32, 6, 8, 12};
        int count = 0;
        for (int x: array1) {
            if (x % 2 != 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            if (x % 2 != 0) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //300
        /*int[] array1 = {5, -3, -7, -15, 2, 6, 17, 12};
        int count = 0;
        int k = 30;
        for (int x: array1) {
            int suqare = x * x;
            if (suqare < k) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            int suqare = x * x;
            if (suqare < k) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //301
        /*int count = 0;
        int k = 8;
        for (int i = 10; i <= 99; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % k == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //302
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 2) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 2) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //303
        /*int count = 0;
        int n = 50;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //304
        /*int count = 0;
        int n = 50;
        for (int i = 1; i < n; i++) {
            if (n % i == 2) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 2) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //305
        /*int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //306
        /*int count = 0;
        for (int i = 10; i <= 99; i++) {
            int a = i % 10;
            int b = i / 10;
            if (a + b > 5) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            int a = i % 10;
            int b = i / 10;
            if (a + b  > 5) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //307
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            int sum = a + b + c;
            if (sum == 9) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            int sum = a + b + c;
            if (sum == 9) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //308
        /*int count = 0;
        int k = 15;
        for (int i = 10; i <= 999; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 999; i++) {
            if (i % k == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //309
        /*int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //310
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            if (a == b) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            if (a == b) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //311
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int count = 0;
        int max = array1[0];
        for (int i = 0; i < n; i++) {
            if (max < array1[i]){
                max = array1[i];
            }
            if (array1[i] > 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > 0) {
                array2[index] = array1[i] + max;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //312
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int[] array2 = new int[n / 2];
        int index = 0;
        for (int i = 0; i < n - 1; i += 2) {
            int mod1 = (array1[i] < 0) ? -array1[i] : array1[i];
            int mod2 = (array1[i+1] < 0) ? -array1[i+1] : array1[i+1];
            if (mod1 > mod2) {
                array2[index] = array1[i];
                index++;
            }else {
                array2[index] = array1[i+1];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //313
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int[] array2 = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0){
                array2[index] = array1[i];
                index++;
            } else if (i % 2 == 0) {
                array2[index] = array1[i];
                array2[++index] = array1[i - 1];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //314
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > 0 ){
                count++;
            }
        }
        int[] array2 = new int[n + count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > 0 ){
                array2[index] = array1[i];
                array2[++index] = 0;
                index++;
            } else {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        // homework from presentation
        //1
        /*int[] array = {5, 10};
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //2
        /*int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //3
        /*int count = 0;
        for (int i = -20; i < 20; i ++) {
            int a = (i < 0) ? -i : i;
            if (a % 2 != 0){
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = -20; i < 20; i ++) {
            int a = (i < 0) ? -i : i;
            if (a % 2 != 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //4
        /*int [] array = {5, 12, -3, -4, 15, 22, -6, 9, 65, 20};
        for(int x : array){
            if(x % 5 == 0){
                System.out.print(x + " ");
            }
        }*/

        //5
        /*double [] array = {54.2, 12.5, -3, -4, 15.25, 29, -6.7, 9, 65.104, 206.1};
        for(double x : array){
            if(x > 24.12 && x < 467.23){
                System.out.print(x + " ");
            }
        }*/

        //6
        /*int [] array = {5, 12, -3, -4, 15, 22, -6, 9, 65, 20};
        int count = 0;
        for(int x : array){
            if(x % 2 == 0){
                count++;
            }
        }
        System.out.print(count);*/

        //7
        /*int n = 12;
        int i = 1;
        while (i > 0 && i < 11){
            int mul = n * i;
            System.out.println(n + " X " + i + "= " + mul);
            i++;
        }*/







    }
}
=======
public class Homework3_1 {
    public static void main(String[] args) {
        //291
        /*int[] array1 = {5, -3, 7, -15, -3, 6, 20, 12};
        int k = 0;
        for (int x: array1) {
            if(x > 0){
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int x: array1) {
            if(x > 0){
                array2[index] = x;
                index++;
            }
        }
        for (int x: array2) {
            System.out.print(x+ " ");
        }*/

        //292
        /*int[] array1 = {5, -3, 7, -15, -3, 6, 21, 12};
        int k = 0;
        for (int x : array1) {
            if (x % 7 == 0) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int x : array1) {
            if (x % 7 == 0) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //293
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 21, 12};
        int k = 0;
        int a = 6;
        int b = 17;
        for (int x : array1) {
            if (a < x && b > x) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int x : array1) {
            if (a < x && b > x) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //294
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 21, 12};
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //295
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 21, 12};
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                k++;
            }
        }
        int[] array2 = new int[k];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //296
        /*int[] array1 = {5, -3, 7, 15, -3, 6, 17, 12};
        int count = 0;
        int k = 3;
        for (int x: array1) {
            if (x % k == 2) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            if (x % k == 2) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //297
        /*int[] array1 = {5, -3, -7, -15, -3, 6, 17, 12};
        int count = 0;
        int k = 6;
        for (int x: array1) {
            int absValue = (x < 0) ? -x : x;
            if (absValue > k) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            int absValue = (x < 0) ? -x : x;
            if (absValue > k) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //298
        /*int[] array1 = {5, -3, -7, -15, -3, 6, 8, 12};
        int count = 0;
        for (int x: array1) {
            if (x % 2 == 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            if (x % 2 == 0) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //299
        /*int[] array1 = {5, -3, -7, -15, 32, 6, 8, 12};
        int count = 0;
        for (int x: array1) {
            if (x % 2 != 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            if (x % 2 != 0) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //300
        /*int[] array1 = {5, -3, -7, -15, 2, 6, 17, 12};
        int count = 0;
        int k = 30;
        for (int x: array1) {
            int suqare = x * x;
            if (suqare < k) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int x: array1) {
            int suqare = x * x;
            if (suqare < k) {
                array2[index] = x;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //301
        /*int count = 0;
        int k = 8;
        for (int i = 10; i <= 99; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % k == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //302
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 2) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 2) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //303
        /*int count = 0;
        int n = 50;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //304
        /*int count = 0;
        int n = 50;
        for (int i = 1; i < n; i++) {
            if (n % i == 2) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 2) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //305
        /*int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //306
        /*int count = 0;
        for (int i = 10; i <= 99; i++) {
            int a = i % 10;
            int b = i / 10;
            if (a + b > 5) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            int a = i % 10;
            int b = i / 10;
            if (a + b  > 5) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //307
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            int sum = a + b + c;
            if (sum == 9) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            int sum = a + b + c;
            if (sum == 9) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //308
        /*int count = 0;
        int k = 15;
        for (int i = 10; i <= 999; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 999; i++) {
            if (i % k == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //309
        /*int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //310
        /*int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            if (a == b) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            if (a == b) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //311
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int count = 0;
        int max = array1[0];
        for (int i = 0; i < n; i++) {
            if (max < array1[i]){
                max = array1[i];
            }
            if (array1[i] > 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > 0) {
                array2[index] = array1[i] + max;
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //312
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int[] array2 = new int[n / 2];
        int index = 0;
        for (int i = 0; i < n - 1; i += 2) {
            int mod1 = (array1[i] < 0) ? -array1[i] : array1[i];
            int mod2 = (array1[i+1] < 0) ? -array1[i+1] : array1[i+1];
            if (mod1 > mod2) {
                array2[index] = array1[i];
                index++;
            }else {
                array2[index] = array1[i+1];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //313
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int[] array2 = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0){
                array2[index] = array1[i];
                index++;
            } else if (i % 2 == 0) {
                array2[index] = array1[i];
                array2[++index] = array1[i - 1];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        //314
        /*int [] array1 = {5, 12, -3, -4, 15, 22, -6, 9};
        int n = 8;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > 0 ){
                count++;
            }
        }
        int[] array2 = new int[n + count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > 0 ){
                array2[index] = array1[i];
                array2[++index] = 0;
                index++;
            } else {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int x : array2) {
            System.out.print(x + " ");
        }*/

        // homework from presentation
        //1
        /*int[] array = {5, 10};
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //2
        /*int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //3
        /*int count = 0;
        for (int i = -20; i < 20; i ++) {
            int a = (i < 0) ? -i : i;
            if (a % 2 != 0){
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = -20; i < 20; i ++) {
            int a = (i < 0) ? -i : i;
            if (a % 2 != 0) {
                array[index] = i;
                index++;
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }*/

        //4
        /*int [] array = {5, 12, -3, -4, 15, 22, -6, 9, 65, 20};
        for(int x : array){
            if(x % 5 == 0){
                System.out.print(x + " ");
            }
        }*/

        //5
        /*double [] array = {54.2, 12.5, -3, -4, 15.25, 29, -6.7, 9, 65.104, 206.1};
        for(double x : array){
            if(x > 24.12 && x < 467.23){
                System.out.print(x + " ");
            }
        }*/

        //6
        /*int [] array = {5, 12, -3, -4, 15, 22, -6, 9, 65, 20};
        int count = 0;
        for(int x : array){
            if(x % 2 == 0){
                count++;
            }
        }
        System.out.print(count);*/

        //7
        /*int n = 12;
        int i = 1;
        while (i > 0 && i < 11){
            int mul = n * i;
            System.out.println(n + " X " + i + "= " + mul);
            i++;
        }*/







    }
}
>>>>>>> 9cce9385188ac407a6c7159d3ec49d60bd69e895
