package bai5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap số lương: ");
        double salary = sc.nextDouble();
        System.out.print("Nhap số năm kinh nghiệm: ");
        int years = sc.nextInt();

        System.out.println("Lương sau khi tăng: " + (years > 5 ? (salary = salary + salary * 0.1) : (salary = salary + salary * 0.05)));
    }
}
