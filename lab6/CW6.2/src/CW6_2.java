import java.util.Random;

public class CW6_2 {

    static class Host extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from worker thread!");
            MyThread t = new MyThread();
            t.start();
            Random rand = new Random();
            try {
                Thread.sleep(rand. nextInt(50000)+10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.terminate();
        }
    }

     static class MyThread extends Thread {
        private boolean run = true;
        @Override
        public void run() {
            while(run) {
                System.out.println("Trying to connect");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        void terminate() {
            run = false;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Host();
        t.start();
    }
}
