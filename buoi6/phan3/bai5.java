package buoi6.phan3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tienGoc, tienMucTieu, laiSuat;
        int nam = 0;

        System.out.print("Nhập số tiền ban đầu (VND): ");
        tienGoc = sc.nextDouble();

        System.out.print("Nhập số tiền mong muốn trong tương lai (VND): ");
        tienMucTieu = sc.nextDouble();

        System.out.print("Nhập lãi suất tiết kiệm (%/năm): ");
        laiSuat = sc.nextDouble();

        double soTienHienTai = tienGoc;


        while (soTienHienTai < tienMucTieu) {
            soTienHienTai += soTienHienTai * laiSuat / 100;
            nam++;
        }


        System.out.println("\n=== KẾT QUẢ ===");
        System.out.println("Số năm cần chờ: " + nam + " năm");
        System.out.printf("Số tiền sau %d năm: %.2f VND\n", nam, soTienHienTai);

        sc.close();
    }
}
