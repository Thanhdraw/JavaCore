package phan2;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = null;
        int n = 0;

        System.out.println("Bạn muốn nhập dữ liệu hay dùng dữ liệu mẫu?");
        System.out.println("1. Nhập thủ công");
        System.out.println("2. Tạo dữ liệu giả");
        System.out.print("Chọn: ");
        int chon = sc.nextInt();
        sc.nextLine();
        if (chon == 1) {
            System.out.print("Nhập số sinh viên: ");
            n = sc.nextInt();
            sc.nextLine();

            students = new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nNhập sinh viên thứ " + (i + 1) + ": ");
                System.out.print("Mã sinh viên: ");
                String id = sc.nextLine();
                System.out.print("Tên sinh viên: ");
                String name = sc.nextLine();
                System.out.print("Nhập điểm Toán: ");
                double math = sc.nextDouble();
                System.out.print("Nhập điểm Lý: ");
                double physics = sc.nextDouble();
                System.out.print("Nhập điểm Hóa: ");
                double chemistry = sc.nextDouble();
                sc.nextLine();
                students[i] = new Student(id, name, math, physics, chemistry);
            }
        } else {
            students = taoDuLieuGia();
            n = students.length;
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

    public static Student[] taoDuLieuGia() {
        Student[] students = {
                new Student("SV001", "Nguyen Van A", 8.5, 7.5, 9.0),
                new Student("SV002", "Le Thi B", 5.0, 6.0, 5.5),
                new Student("SV003", "Tran Van C", 9.0, 8.8, 9.2),
                new Student("SV004", "Pham Thi D", 4.0, 5.0, 4.5),
                new Student("SV005", "Do Van E", 7.0, 6.5, 7.5)
        };
        System.out.println("✅ Đã tạo dữ liệu mẫu thành công (" + students.length + " sinh viên)");
        return students;
    }

}
