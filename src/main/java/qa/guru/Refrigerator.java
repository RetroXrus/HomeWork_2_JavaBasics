package qa.guru;

public class Refrigerator {
    private int x;
    private int y;

    public Refrigerator(int a, int b) {
        x = a;
        y = b;
    }

    void drawing() {
        System.out.println("5. Refrigerator");
        System.out.println();
        int height = 1;
        while (height <= y) {
            int width = 1;
            while (width <= x) {
                if (height == 1 || height == y) {
                    System.out.print('T');
                } else if (width == 1 || width == x) {
                    System.out.print('T');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }

}
