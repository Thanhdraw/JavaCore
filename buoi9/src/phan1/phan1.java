package phan1;

import java.util.Arrays;
import java.util.Scanner;

public class phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap cac phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Chon chuong trinh: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                sumArray(arr);
                break;
            case 2:
                System.out.println("So lon nhat trong mang la: " + maxValue(arr));
                break;

            case 3:
                System.out.println("So nho nhat trong mang la: " + minValue(arr));
                break;
            case 4:
                countEvenOdd(arr);
                break;
            case 5:
                System.out.print("Mang truoc khi doi: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                reverseArray(arr);
                System.out.print("\nMảng sau khi đảo: ");
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                break;
            case 6:
                System.out.println("Nhap so can tim: ");
                int x = sc.nextInt();
                if (isExist(arr, x)) {
                    System.out.printf(x + " có tồn tại trong mảng");
                } else {
                    System.out.println(x + " không tồn tại trong mảng");
                }
            case 7:
                average(arr);
                break;
            case 8:
                System.out.println("Nhap so can tim: ");
                int y = sc.nextInt();
                countOccurrences(arr, y);
                break;
            case 9:
                int[] brr = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap cac phan tu " + (i + 1) + ": ");
                    brr[i] = sc.nextInt();
                }
                mergeArrays(arr, brr);
                break;
            case 10:
                sortAscending(arr);
                break;
            default:
                System.out.println("Chon sai chuong trinh");
                break;
        }


    }

    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Tong cac phan tu trong mang: " + sum);
    }

    public static double maxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double minValue(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static void countEvenOdd(int[] arr) {
        int count_even = 0;
        int count_odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
        }
        System.out.println("So chan trong mang: " + count_even);
        System.out.println("So le trong mang: " + count_odd);
    }

    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

    }

    public static boolean isExist(int[] arr, int x) {
        for (int i : arr) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }

    public static void average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = sum / arr.length;
        System.out.println("Giá trị trung bình trong mảng: " + average);
    }

    public static void countOccurrences(int[] arr, int y) {
        int count = 0;
        for (int i : arr) {
            if (i == y) {
                count++;
            }
        }
        System.out.println("So lần xuất hiện của " + y + " trong mang: " + count);
    }

    public static void mergeArrays(int[] arr, int[] brr) {
        int length = arr.length + brr.length;
        int[] temp = new int[length];
        int index = 0;
        for (int i : arr) {
            temp[index] = i;
            index++;
        }
        for (int j : brr) {
            temp[index] = j;
            index++;
        }
        System.out.println("Mang sau khi nối là: " + Arrays.toString(temp));
    }

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
