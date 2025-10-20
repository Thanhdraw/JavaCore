package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = sc.nextInt();
        int max = Math.max(a, b);

        System.out.println("Số lớn nhất là:  " + max);
        sc.close();
    }
}
