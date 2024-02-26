package concurrency;

public class PollingDemo {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.print(PollingDemo.counter + ",");
                PollingDemo.counter++;
            }
        }).start();
        while (PollingDemo.counter < 20) {
            System.out.println("Not reached yet");
            Thread.sleep(5); // 1 SECOND
        }
        System.out.println("Reached!");
    }

}
