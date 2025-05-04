public class CounterThread extends Thread {

    Counter counter;
    String name;

    public CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            counter.count(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
