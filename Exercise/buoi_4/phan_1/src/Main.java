import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("1.Xác định số nguyên lớn nhất");
            System.out.println("2.Sắp xếp tăng dần");
            System.out.println("3.Sắp xếp giảm dần");
            System.out.println("4.Cách đọc số nguyên");
            System.out.print("Chọn chương trình: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    xacDinhSoNguyenLonNhat();
                    break;
                case 2:
                    sapXepTangDan();
                    break;
                case 3:
                    sapXepGiamDan();
                    break;
                case 4:
                    cachDocSoNguyen();
                    break;
            }

        } while (choice != 0);
    }

    public static void xacDinhSoNguyenLonNhat() {
        sc.nextLine();
        System.out.println("Nhap m: ");
        int m = sc.nextInt();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int max = Math.max(m, n);
        System.out.println("Số lon nhất là: " + max);
    }

    public static void sapXepTangDan() {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sắp xếp tăng dần");
        for (int i = 0; i < 3; i++) {
            System.out.println("xuất " + (i + 1) + ": " + arr[i]);
        }
    }

    public static void sapXepGiamDan() {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("xuất " + (i) + ": " + arr[i]);
        }
    }
    public static void cachDocSoNguyenLonNhat() {

    }
}