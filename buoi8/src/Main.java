import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chương trình ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            case 5:
                bai5();
                break;
            case 6:
                bai6();
                break;
            case 7:
                bai7();
                break;

            default:
                System.out.println("Chon so khong phu hop");
                break;
        }


    }

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen thứ 1: ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen thứ 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Tong 2 số là: " + sum);

    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double a = sc.nextDouble();
        System.out.println("Nhap chiều rộng: ");
        double b = sc.nextDouble();
        double area = a * b;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cạnh: ");
        double a = sc.nextDouble();
        double thetich = Math.pow(a, 3);
        System.out.println("The tích của là: " + thetich);
    }

    public static void bai5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        System.out.println("Tổng 1 đến n là: " + sum);
    }

    public static void bai6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "là số chẵn");
        } else {
            System.out.println(n + "là số lẻ");
        }
    }

    public static void bai7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }



}