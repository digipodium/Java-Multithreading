package threading.examples;

public class Looping extends Thread {
    private long num;

    public Looping(long number) {
        num = number;
    }

    @Override
    public void run() {
        for (long i = -num; i <= num; i++) {
            System.out.println("value of i:"+i+" thread->"+this.getName());
        }
    }

    public static void main(String[] args) {
        Looping looper1 = new Looping(10);
        Looping looper2 = new Looping(10);
        Looping looper3 = new Looping(10);
        Looping looper4 = new Looping(10);
        looper4.setPriority(Thread.MAX_PRIORITY);
        looper2.setPriority(Thread.MIN_PRIORITY);
        looper1.setName("Sonu");
        looper4.setName("Monti");
        looper2.setName("Hera");
        looper1.setName("Zeeshan");
        looper1.start();
        looper2.start();
        looper4.start();
        looper3.start();

    }
}
