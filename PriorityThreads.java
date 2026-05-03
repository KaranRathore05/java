public class PriorityThreads{
    static class Mythread extends Thread {
        public void run() {
        System.out.println(
        Thread.currentThread().getName()
        + " Priority: "
        + Thread.currentThread().getPriority());
    }
    }

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}