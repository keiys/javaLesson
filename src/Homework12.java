public class Homework12 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter, "T1");
        CounterThread t2 = new CounterThread(counter, "T2");
        CounterThread t3 = new CounterThread(counter, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
