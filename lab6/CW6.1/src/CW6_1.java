import java.util.Date;

public class CW6_1 {
    static class SomeTask implements Runnable {
        public void run() {
            Date date=java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            Date date=java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Thread t1 = new Thread(new SomeTask());
            t1.setName("t1");

            Thread t2 = new MyThread();
            t2.setName("t2");

            t1.start();
            t2.start();

        }
    }
}
