package phan1;

import java.util.*;

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
        System.out.println("\n===== MENU =====");
        System.out.println("1. Tính tổng mảng");
        System.out.println("2. Tìm giá trị lớn nhất");
        System.out.println("3. Tìm giá trị nhỏ nhất");
        System.out.println("4. Đếm số chẵn / lẻ");
        System.out.println("5. Đảo ngược mảng");
        System.out.println("6. Kiểm tra phần tử có tồn tại");
        System.out.println("7. Tính giá trị trung bình");
        System.out.println("8. Đếm số lần xuất hiện");
        System.out.println("9. Nối hai mảng");
        System.out.println("10. Sắp xếp tăng dần");
        System.out.println("11. Xóa phần tử khỏi mảng");
        System.out.println("12. Thêm phần tử vào mảng");
        System.out.println("13. Tìm số nguyên tố trong mảng");
        System.out.println("14. Tìm số xuất hiện nhiều trong mảng");
        System.out.println("15. Tách mảng chẳng và mảng lẻ");
        System.out.println("16.Xoay mảng sang phải k lần");
        System.out.println("17.Kiểm tra mảng có đối xứng hay không (Palindrome Array)");
        System.out.println("18.Gộp và sắp xếp hai mảng rồi loại bỏ phần tử trùng");
        System.out.println("19.Tìm dãy con có tổng lớn nhất (Maximum Subarray Sum – Kadane’s Algorithm)");
        System.out.println("20.Ma trận và hàm xử lý (2D array)");
        System.out.print("Chon chuong trinh: ");

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
            case 11:
                System.out.println("Nhap so can xóa: ");
                int val = sc.nextInt();
                removeElement(arr, val);
                break;
            case 12:
                System.out.println("Giá trị phần tử thêm vào: ");
                int value = sc.nextInt();
                System.out.println("Vị trí thêm vào: ");
                int pos = sc.nextInt();
                insertElement(arr, pos, value);
                break;
            case 13:
                printPrimeNumbers(arr);
                break;
            case 14:
                mostFrequentElement(arr);
                break;
            case 15:
                splitEvenOdd(arr);
                break;
            case 16:
                System.out.println("Nhap số k: ");
                int k = sc.nextInt();
                rotateRight(arr, k);
                break;
            case 17:
                System.out.println(isSymmetric(arr));
                break;
            case 18:
                int[] b = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap cac phan tu " + (i + 1) + ": ");
                    b[i] = sc.nextInt();
                }
                int[] merged = mergeUnique(arr, b);
                System.out.println("Mảng sau khi gộp và loại trùng: " + Arrays.toString(merged));
                break;
            case 19:
                int maxSum = maxSubArraySum(arr);
                System.out.println("Tổng lớn nhất của dãy con liên tiếp: " + maxSum);
                break;
            case 20:
                System.out.print("Nhập số hàng: ");
                int rows = sc.nextInt();
                System.out.print("Nhập số cột: ");
                int cols = sc.nextInt();

                int[][] matrix = new int[rows][cols];

                System.out.println("Nhập các phần tử ma trận:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Tổng toàn ma trận: " + sumMatrix(matrix));
                System.out.println("Tổng đường chéo chính: " + sumMainDiagonal(matrix));
                System.out.println("Phần tử lớn nhất trong ma trận: " + findMaxInMatrix(matrix));
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

    public static void removeElement(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(val + " không tồn tại");
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i : arr) {
            if (i != val) {
                newArr[index] = i;
                index++;
            }
        }
        System.out.println("Mang sau khi xóa phần tử " + val + " : " + Arrays.toString(newArr));
    }

    public static void insertElement(int[] arr, int pos, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];

        }
        System.out.println("Mảng sau khi chèn " + value + " tại vị trí " + pos + ":");
        System.out.println(Arrays.toString(newArr));

    }

    public static void printPrimeNumbers(int[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == 2) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co so nguyen to nao");
        }
        System.out.println();
    }

    public static int isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;

    }

    public static void mostFrequentElement(int[] arr) {
        int max_count = 0;
        int most_freq = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max_count) {
                max_count = count;
                most_freq = arr[i];
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất là: " + most_freq + " (" + max_count + " lần)");
    }

    public static void splitEvenOdd(int[] arr) {
        int count_even = 0;
        int count_odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
        }
        int[] arr_even = new int[count_even];
        int[] arr_odd = new int[count_odd];
        int index_even = 0;
        int index_odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr_even[index_even] = arr[i];
                index_even++;
            } else {
                arr_odd[index_odd] = arr[i];
                index_odd++;
            }
        }
        System.out.println(Arrays.toString(arr_even));
        System.out.println(Arrays.toString(arr_odd));

    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isSymmetric(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] mergeUnique(int[] a, int[] b) {
        int n = a.length + b.length;
        int[] temp = new int[n];


        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, temp, a.length, b.length);

        // Sắp xếp
        Arrays.sort(temp);

        // Loại trùng
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (temp[i] != temp[i - 1]) count++;
        }

        int[] result = new int[count];
        result[0] = temp[0];
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (temp[i] != temp[i - 1]) {
                result[index++] = temp[i];
            }
        }

        return result;
    }

    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // ---------------- Hàm tính tổng toàn ma trận ----------------
    public static int sumMatrix(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

    // ---------------- Hàm tính tổng đường chéo chính ----------------
    public static int sumMainDiagonal(int[][] m) {
        int sum = 0;
        int n = Math.min(m.length, m[0].length); // Tránh ma trận không vuông
        for (int i = 0; i < n; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    // ---------------- Hàm tìm phần tử lớn nhất trong ma trận ----------------
    public static int findMaxInMatrix(int[][] m) {
        int max = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        return max;
    }


}
