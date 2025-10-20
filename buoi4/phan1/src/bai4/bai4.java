package bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên có hai chữ số: ");
        int n = sc.nextInt();


        if (n < 10 || n > 99) {
            System.out.println("Vui lòng nhập số có đúng hai chữ số!");
            return;
        }
        int chuc = n / 10;
        int donVi = n % 10;

        String[] docSo = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        System.out.print("Cách đọc: ");
        switch (chuc) {
            case 1:
                System.out.print("Mười");
                break;
            default:
                System.out.print(docSo[chuc] + " mươi");
                break;
        }
        if (donVi == 0 && chuc != 0) {

        } else if (chuc == 1 && donVi == 5) {
            System.out.print(" lăm");
        } else if (chuc > 1 && donVi == 1) {
            System.out.print(" mốt");
        } else if (donVi != 0) {
            System.out.print(" " + docSo[donVi]);
        }

        System.out.println();
        sc.close();
    }
}
