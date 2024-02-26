package concurrency;

class SimpleThread {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("I'm a runnable thread");
        };


        Thread t1 = new Thread(r1);
        System.out.println(t1.getId() + "-" + t1.getName() + t1.toString());
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                System.out.println("I'm an anonmous Thread");
            }
        };


        t2.start();
    }
}