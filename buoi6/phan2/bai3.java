package buoi6.phan2;

public class bai3 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                count++;
            }
            i++;
        }
        for (i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count + " số chia hết cho 3");
    }
}
