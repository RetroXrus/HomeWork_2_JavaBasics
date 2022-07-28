package qa.guru;

public class DoubleCompare {
    private double a;
    private double b;

    public DoubleCompare(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //Сравним вещественные числа с точностью до одной миллионной
    void doubleCompareResult() {
        System.out.println(Math.abs(a - b) <= 0.000001 ? "1. Double numbers are equal" : "1. Double numbers aren't equal");
    }

}
