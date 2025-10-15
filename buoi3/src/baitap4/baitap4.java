package src.baitap4;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ (°C): ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
        sc.close();
    }
}
