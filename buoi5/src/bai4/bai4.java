package bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhap số nguyên b: ");
        int b = sc.nextInt();
        System.out.print("Nhap số nguyên c: ");
        int c = sc.nextInt();
        System.out.println(a > b && a > c ? a : (b > c ? b : c));
    }
}
