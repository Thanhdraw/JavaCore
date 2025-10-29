package buoi6.phan2;

public class bai1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        for (i = 0; i < 100; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        for (i = 0; i < 100; i += 2) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
