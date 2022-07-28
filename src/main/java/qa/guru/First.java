package qa.guru;

public class First {
    public static void main(String[] args) {
        //  1. Сравним вещественные числа с точностью до одной миллионной
        DoubleCompare highAccuracyCompare = new DoubleCompare(4.000003, 4.0000029);
        highAccuracyCompare.doubleCompareResult();

        //  2. Переполнение: прибавляем к максимальному int число и определяем будет ли переполнение или нет
        //Overflow bigNumber = new Overflow(2147483648);    //  Переполнение при компиляции
        Overflow bigNumber = new Overflow(3);
        bigNumber.intOverflow();

        //  3. Сумма чисел разного формата
        int a = 1;
        double b = 1.49;
        System.out.println("3. It's double " + (a + b));

        //  4. Сумма чисел разного формата после приведения к int
        System.out.println("4. It's integer " + (a + (int) Math.round(b)));

        //  5. Выведем контур холодильника буквами Т
        Refrigerator contour = new Refrigerator(9, 7);
        contour.drawing();
    }

}
