package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        int[] numbers = {a, b, c};
        System.out.println("Chọn cách sắp xếp:");
        System.out.println("1. Tăng dần");
        System.out.println("2. Giảm dần");
        System.out.print("Nhập lựa chọn (1 hoặc 2): ");
        int choice = sc.nextInt();

        Arrays.sort(numbers);
        if (choice == 1) {
            System.out.println("Ba số theo thứ tự tăng dần: " +
                    numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        }else if (choice == 2) {
            System.out.println("Ba số theo thứ tự giảm dần: " + numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        }else {
            System.out.println("Lựa chọn không hợp lệ!");

        }
        sc.close();

    }
}
