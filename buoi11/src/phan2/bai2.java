package phan2;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap số sinh viên: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1) + " : ");
            sc.nextLine();
            System.out.println("Mã sinh vien: ");
            String id = sc.nextLine();
            System.out.println("Tên sinh viên: ");
            String name = sc.nextLine();
            System.out.println("Nhập điểm Toán: ");
            double mathScore = sc.nextDouble();
            System.out.println("Nhập điểm Lý: ");
            double mathPhysics = sc.nextDouble();
            System.out.println("Nhập điểm Hóa: ");
            double mathChemistry = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(id, name, mathScore, mathPhysics, mathChemistry);
        }
        System.out.println("Chọn chương trình: ");
        System.out.println("1.In danh sách sinh viên");
        System.out.println("2.Tìm sinh vien có điểm trung bình cao nhất");
        System.out.println("3.Tìm sinh viên yếu");
        System.out.println("4.Tìm sinh theo tên");
        System.out.println("5.Tìm sinh viên theo mã");
        System.out.println("6.Xóa sinh viên theo mã");

        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-15s\n",
                            "Mã SV", "Họ tên", "Toán", "Lý", "Hóa", "ĐTB", "Xếp loại");
                    System.out.println("-------------------------------------------------------------------------------");
                    for (Student student : students) {
                        student.display();
                    }
                    break;
                case 2:
                    double avgHighest = students[0].getAverage();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getAverage() > avgHighest) {
                            avgHighest = students[i].getAverage();
                        }
                    }
                    System.out.println("\n===== SINH VIÊN CÓ ĐIỂM CAO NHẤT =====");
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-15s\n",
                            "Mã SV", "Họ tên", "Toán", "Lý", "Hóa", "ĐTB", "Xếp loại");
                    for (Student student : students) {
                        if (student.getAverage() == avgHighest) {
                            student.display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n===== SINH VIÊN YẾU =====");
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-15s\n",
                            "Mã SV", "Họ tên", "Toán", "Lý", "Hóa", "ĐTB", "Xếp loại");
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getGrade().equals("Yếu")) {
                            students[i].display();
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("TÌM KIẾM THEO TÊN");
                    System.out.println("Nhập tên cần tìm");
                    String name = sc.nextLine();
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-15s\n",
                            "Mã SV", "Họ tên", "Toán", "Lý", "Hóa", "ĐTB", "Xếp loại");
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getFullName().toLowerCase().contains(name.toLowerCase())) {
                            students[i].display();
                        }
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("TÌM KIẾM THEO MÃ");
                    System.out.println("Nhập mã sinh viên cần tìm: ");
                    String id = sc.nextLine();
                    System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s %-15s\n",
                            "Mã SV", "Họ tên", "Toán", "Lý", "Hóa", "ĐTB", "Xếp loại");
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getStudentId().equalsIgnoreCase(id)) {
                            students[i].display();
                        }
                    }
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("XÓA SINH VIÊN");
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    String delId = sc.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < n; i++) {
                        if (students[i].getStudentId().equalsIgnoreCase(delId)) {
                            for (int j = i; j < n - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[n - 1] = null;
                            n--;
                            deleted = true;
                            System.out.println("Xóa sinh viên thành công!");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Không tìm thấy sinh viên với mã " + delId);
                    }
                    break;
            }
        } while (choice <= 0);

        sc.close();
    }
}
