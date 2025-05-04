public class Counter {

    static boolean isActive1 =  true;
    static boolean isActive2 = true;

    public synchronized void count(String name) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println(name + ": " + i);

            if(i == 5 && isActive1){
                isActive1 = false;
                wait();
            }

            if(i == 7 && isActive2){
                isActive2 = false;
                wait();
            }

            if(i == 10 && !isActive1 && !isActive2){
                notifyAll();
            }
        }
    }
}
