package threading.examples;

public class PrimeSum {
    private int limit;

    public PrimeSum(int limit) {
        this.limit = limit;
    }

    private int handler() {
        int sum = 0;
        for (int num = 2; num < limit; num++) {
            int flag = 0;
            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public void showSum() {
        Runnable t1 = () -> {
            int sum = handler();
            System.out.printf("from start to %d, sum ->%d%n", limit, sum);
        };
        t1.run();
    }

    public static void main(String[] args) {
        PrimeSum p1 = new PrimeSum(200);
        PrimeSum p2 = new PrimeSum(2000);
        PrimeSum p3 = new PrimeSum(3000);
        p1.showSum();
        p2.showSum();
        p3.showSum();

    }
}
