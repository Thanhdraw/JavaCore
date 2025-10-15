package src.baitap6;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sản phẩm 1: ");
        int gia1 = sc.nextInt();

        System.out.print("Nhập giá sản phẩm 2: ");
        int gia2 = sc.nextInt();

        System.out.print("Nhập giá sản phẩm 3: ");
        int gia3 = sc.nextInt();

        int tong = gia1 + gia2 + gia3;

        System.out.println("---------------------------");
        System.out.println("Tổng tiền cần thanh toán là: " + tong + " đồng");

        sc.close();
    }
}
