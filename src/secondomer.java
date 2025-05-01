import java.util.Scanner;

public class secondomer {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] minute = new int[1];
        int[] second = new int[1];
        System.out.print("Enter minutes: ");
        minute[0] = sc.nextInt();
        System.out.print("Enter seconds: ");
        second[0] = sc.nextInt();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (minute[0] > 0 || second[0] > 0) {
                    System.out.printf("%02d:%02d%n", minute[0], second[0]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (second[0] > 0) {
                        second[0]--;
                    } else if (minute[0] > 0) {
                        minute[0]--;
                        second[0] = 59;
                    }
                }
            }
        });
        t1.start();
        t1.join();


    }
}
