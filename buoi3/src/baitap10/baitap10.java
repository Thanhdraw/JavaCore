package src.baitap10;

public class baitap10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

    }
}
