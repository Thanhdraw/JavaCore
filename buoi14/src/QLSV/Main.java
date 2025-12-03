package QLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<SinhVien> danhsachSinhVien = new ArrayList<SinhVien>();
    static ArrayList<GiangVien> danhsachGiangVien = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        danhsachGiangVien.add(new GiangVien("Thầy Minh", 40, "Nam", 20000000));
        TruongHoc truongHoc = new TruongHoc("Đại Học FPT", "DH123", 200000000);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Phân bổ học viên cho giảng viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm sinh viên theo mã");
            System.out.println("5. Xóa sinh viên theo mã");
            System.out.println("6. Tính điểm trung bình");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> themSinhVien();
                case 2 -> phanBoHocVien();
                case 3 -> hienThiSinhVien();
                case 4 -> timSinhVien();
                case 5 -> xoaSinhVien();
                case 6 -> tinhDiemTrungBinh();
                case 0 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Sai lựa chọn!");
            }
        }
    }

    public static void themSinhVien() {
        System.out.print("Nhập mã SV: ");
        String ma = sc.nextLine();
        System.out.print("Tên: ");
        String ten = sc.nextLine();
        System.out.print("Tuổi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        String gt = sc.nextLine();
        danhsachSinhVien.add(new SinhVien(ma, ten, tuoi, gt));
    }

    public static void hienThiSinhVien() {
        for (SinhVien sv : danhsachSinhVien) {
            System.out.println(sv.toString());
        }
    }

    public static SinhVien timSV(String ma) {
        for (SinhVien sv : danhsachSinhVien) {
            if (sv.getMaSV().equalsIgnoreCase(ma)) {
                return sv;
            }
        }
        return null;
    }

    public static void timSinhVien() {
        System.out.println("Nhập mã sinh viên cần tìm: ");
        String ma = sc.nextLine();
        SinhVien sv = timSV(ma);
        if (sv != null) {
            System.out.println(sv.toString());
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    public static void xoaSinhVien() {
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String ma = sc.nextLine();
        SinhVien sv = timSV(ma);
        if (sv != null) {
            danhsachSinhVien.remove(sv);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy mã sinh viên");
        }
    }

    public static void phanBoHocVien() {
        System.out.print("Nhập mã sinh viên cần phân bổ: ");
        String ma = sc.nextLine();

        SinhVien sv = timSV(ma);
        if (sv == null) {
            System.out.println("Không tìm thấy sinh viên.");
            return;
        }

        System.out.println("Chọn giảng viên (0 = Thầy Minh): ");
        int indexGV = sc.nextInt();
        if (indexGV >= 0 && indexGV < danhsachGiangVien.size()) {
            danhsachGiangVien.get(indexGV).addHocVien(sv);
            System.out.println("Phân bổ thành công!");
        } else {
            System.out.println("Giảng viên không tồn tại.");
        }
    }

    public static void tinhDiemTrungBinh() {
        System.out.print("Nhập mã sinh viên: ");
        String ma = sc.nextLine();

        SinhVien sv = timSV(ma);
        if (sv == null) {
            System.out.println("Không tìm thấy.");
            return;
        }

        System.out.print("Nhập số lượng điểm: ");
        int so = sc.nextInt();
        for (int i = 0; i <= so; i++) {
            System.out.print("Nhập điểm " + (i + 1) + ": ");
            double d = sc.nextDouble();
            sv.addDiem(d);
        }
        System.out.println("Điểm trung bình là: " + sv.tinhDiemTrungBinh());
    }
}
