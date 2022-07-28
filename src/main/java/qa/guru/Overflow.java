package qa.guru;

public class Overflow {
    private int a;

    public Overflow(int x) {
        a = x;
    }
    private int max = Integer.MAX_VALUE;

    void intOverflow() {
        if (a >= 0) {
            System.out.println(max == max + a ? "2. There is no overflow" : "2. There is an overflow");
        } else {
            System.out.println(max > max + a ? "2. There is no overflow" : "2. There is an overflow");
        }
    }
}
