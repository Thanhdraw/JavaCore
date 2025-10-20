package bai5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào bạn! Ai đang sử dụng máy?");
        System.out.println("Nhập ký hiệu:");
        System.out.println("B - Bò");
        System.out.println("H - Mẹ");
        System.out.println("A - Anh trai");
        System.out.println("E - Em gái");
        System.out.print("Bạn chọn: ");
        String name = sc.nextLine().trim().toUpperCase();
        System.out.println();
        switch (name) {
            case "B":
                System.out.println("Xin chào Bò đáng yêu! Hôm nay học giỏi không nè?");
                break;
            case "A":
                System.out.println("Chào anh trai cool ngầu! Đi tập gym chưa đó?");
                break;
            case "E":
                System.out.println("Chào em gái dễ thương! Hôm nay có ngoan không nè?");
                break;
            case "H":
                System.out.println("Con chào mẹ! Chúc mẹ một ngày thật vui và nhiều năng lượng!");
                break;
            default:
                System.out.println("Xin lỗi, mình chưa biết bạn là ai!");
                break;
        }
        sc.close();

    }
}
