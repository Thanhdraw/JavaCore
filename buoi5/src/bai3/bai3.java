package bai3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap số nguyên x: ");
        int x = sc.nextInt();
        System.out.println(x > 0 ? "Dương" : (x < 0 ? "Âm" : "Bằng 0"));
    }
}
