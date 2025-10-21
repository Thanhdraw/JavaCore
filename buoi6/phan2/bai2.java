package buoi6.phan2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i < n) {
            sum += i;
            i++;
        }
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng là: " + sum);
    }
}
