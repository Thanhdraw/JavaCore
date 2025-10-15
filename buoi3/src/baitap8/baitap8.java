package src.baitap8;

import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập lương cơ bản: ");
        double luongCoBan = sc.nextDouble();

        System.out.print("Nhập tiền thưởng: ");
        double thuong = sc.nextDouble();

        System.out.print("Nhập tiền phạt: ");
        double phat = sc.nextDouble();

        double tongLuong = luongCoBan + thuong - phat;

        System.out.println("---------------------------");
        System.out.printf("Tổng lương thực nhận là: %.2f đồng\n", tongLuong);

        sc.close();
    }
}
