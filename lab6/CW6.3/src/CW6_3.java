public class CW6_3 {

    private static int counter;

    static void inc() {
        counter++;
    }

    static class IncrementerThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                inc();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new IncrementerThread();
        t1.start();
        Thread t2 = new IncrementerThread();
        t2.start();
        Thread t3 = new IncrementerThread();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
