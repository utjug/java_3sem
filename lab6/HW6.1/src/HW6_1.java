public class HW6_1 {

    static int counter = 0;
    static long globalTimer = 0;
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

            long startTime = System.currentTimeMillis();

            Thread t = new Thread("Thread ") {
                @Override
                public void run() {
                    int local_counter = 0;
                    int lowest = 300000;
                    int highest = 600000;
                    for (int j = lowest; j < highest; j++) {
                        if (!prime(j)) {
                            local_counter++;
                        }
                    }
                    counter+=local_counter;
                }
            };
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            globalTimer += endTime-startTime;

            System.out.println("Prime numbers found: " + counter);
            System.out.println("Global exec time: " + globalTimer);
        }
    }

    public static void main(String[] args) {
        Thread t = new Host();
        t.start();
    }
}
