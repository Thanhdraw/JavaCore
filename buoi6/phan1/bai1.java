package buoi6.phan1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sobimat = (int) (Math.random() * 999) + 1;
        int doan;
        int solan = 0;
        System.out.println("=== Trò chơi đoán số bí mật (1–1000) ===");
        while (true) {
            System.out.print("Nhập số bạn đoán: ");
            doan = sc.nextInt();
            solan++;

            if (doan == sobimat) {
                System.out.println("🎉 Chúc mừng! Bạn đã đoán đúng sau " + solan + " lần!");
                break;
            } else if (doan > sobimat) {
                System.out.println("❌ Số bạn nhập LỚN hơn số bí mật.");
            } else {
                System.out.println("❌ Số bạn nhập NHỎ hơn số bí mật.");
            }
        }
        sc.close();
    }
}
