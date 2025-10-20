package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhap số lượng sản phẩm: ");
        int quantity = sc.nextInt();
        System.out.print("Nhap đơn giá sản phẩm: ");
        double price = sc.nextDouble();


        double total = price * quantity;
        double payment;
        if (quantity < 50) {
            payment = total;

        } else if (quantity <= 100) {
            payment = total * 0.92;

        } else {
            int over100 = quantity - 100;
            double paymentFirst100 = 100 * price * 0.92;
            double paymentOver100 = over100 * price * 0.88;
            payment = paymentFirst100 + paymentOver100;
        }
        System.out.println("===Hóa Đơn ====");
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Đơn giá: " + price);
        System.out.println("Tổng tiền ban đầu: " + total);
        System.out.println("Số tiền phải trả: " + payment);
        sc.close();
    }


}
