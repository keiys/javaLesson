public class Homework6 {
    public static void main(String[] args) {
        Homework6 h = new Homework6();
        h.factorial(8);
        h.fibonacci(7);
    }

    public void fibonacci(int n) {
        int first = 1, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }


    }

    public void factorial(int n) {
        int sub = 1;
        if (n == 1 || n == 2) {
            System.out.println(n + "'s factorial is: " + n * 1);
        }else {
            for (int i = 2; i <= n; i++) {
                sub *= i;
            }
            System.out.println(n + "'s factorial is: " + sub);
        }


    }
}
