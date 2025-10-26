package buoi6.phan3;

public class bai2 {
    public static void main(String[] args) {
        int n = 1;
        int tong = 0;

        while (tong <= 10000) {
            tong += n;
            n++;
        }

        System.out.println("Số nguyên dương nhỏ nhất là: " + (n - 1));
        System.out.println("Tổng = " + tong);
    }
}
