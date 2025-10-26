package buoi6.phan3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập x: ");
        int x = sc.nextInt();

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        double tong = tinhTong(x, n);

        System.out.println("S(" + n + ") = " + tong);

        sc.close();
    }


    static double tinhTong(int x, int n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += Math.pow(x, i);
        }
        return tong;
    }
}
