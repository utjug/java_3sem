import java.util.ArrayList;
import java.util.Random;

public class HW6 {
    static int thread_number = 5;
    static int counter = 0;
    public static boolean prime(int num) {
        int i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        return flag;
    }

    static class Host extends Thread {
        @Override
        public void run() {
            ArrayList<Thread> threads = new ArrayList<Thread>();
            for (int i = 0; i < thread_number; i++) {
                int finalI = i;
                Thread t = new Thread("Thread " + (finalI + 1)) {
                    @Override
                    public void run() {
                        long startTime = System.currentTimeMillis();
                        int local_counter = 0;
                        int lowest = 300000 + finalI *Math.round(300000/thread_number);
                        int highest = 300000 + (finalI +1)*Math.round(300000/thread_number);
                        for (int j = lowest; j < highest; j++) {
                            if (!prime(j)) {
                                local_counter++;
                            }
                        }
                        long endTime = System.currentTimeMillis();
                        counter+=local_counter;
                        System.out.println("In range from " + lowest + " to " + highest);
                        System.out.println("locally found: " + local_counter);

                        System.out.println("Exec time: " + (endTime-startTime));
                        //System.out.println(getName() + " finished");
                    }
                };
                t.start();
                threads.add(t);
            }
            for (Thread t: threads) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Prime numbers found: " + counter);
        }
    }



    public static void main(String[] args) {
        Thread t = new Host();
        t.start();
    }
}
