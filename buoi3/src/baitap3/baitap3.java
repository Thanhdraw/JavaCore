package baitap3;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = sc.nextInt();

        System.out.print("Nhập y: ");
        int y = sc.nextInt();

        System.out.print("Nhập z: ");
        int z = sc.nextInt();

        double trungBinh = (x + y + z) / 3.0;
        System.out.printf("Trung bình cộng là: %.2f\n", trungBinh);
        sc.close();
    }
}
