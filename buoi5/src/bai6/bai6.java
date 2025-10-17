package bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mức thu nhập (triệu đồng): ");
        double salary = sc.nextDouble();
        double tax;
        double tax_paid;

        switch ((int) (salary / 10)) {
            case 0:
                tax = 0;
                break;
            case 1:
                tax = 0.10;
                break;
            case 2:
            case 3:
            case 4:
                tax = 0.15;
                break;
            default:
                tax = 0.20;
                break;
        }

        tax_paid = salary * tax;

        System.out.println("Thu nhập: " + salary + " triệu đồng");
        System.out.println("Thuế suất: " + (tax * 100) + "%");
        System.out.println("Số thuế phải đóng: " + tax_paid + " triệu đồng");
    }
}
