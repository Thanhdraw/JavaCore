package phan1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soBiMat = (int) (Math.random() * 999) + 1;
        int doan;
        int soLan = 0;

        System.out.println("=== Trò chơi đoán số bí mật (1–1000) ===");

        while (true) {
            System.out.print("Nhập số bạn đoán: ");
            doan = sc.nextInt();
            soLan++;

            if (doan == soBiMat) {
                System.out.println("🎉 Chúc mừng! Bạn đã đoán đúng sau " + soLan + " lần!");
                break;
            } else if (doan > soBiMat) {
                System.out.println("❌ Số bạn nhập LỚN hơn số bí mật.");
            } else {
                System.out.println("❌ Số bạn nhập NHỎ hơn số bí mật.");
            }
        }

        sc.close();
    }
}
