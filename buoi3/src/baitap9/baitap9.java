package src.baitap9;

import java.util.Scanner;

public class baitap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double chieuDai  = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong  = sc.nextDouble();

        double dienTich = chieuDai *chieuRong;
        double chuVi = (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi là: %.2f, Diện tích là: %.2f\n", chuVi, dienTich);
    }
}
