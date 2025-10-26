package buoi6.phan3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số nguyên n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số lớn hơn 0");
            }
        } while (n <= 0);
        int tong = 0;
        for (int i = 1; i < n; i += 2) {
            tong += i;
        }
        System.out.println("Tổng các số lẻ dương nhỏ hơn " + n + " là: " + tong);
        sc.close();
    }
}
