import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    static ArrayList<GiangVien> dsGiangVien = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        dsGiangVien.add(new GiangVien(40, "Thầy Minh", "Nam", 20000000));
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Phân bổ học viên cho giảng viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm sinh viên theo mã");
            System.out.println("5. Xóa sinh viên theo mã");
            System.out.println("6. Tính điểm trung bình");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    phanBoHocVien();
                    break;
                case 3:
                    hienThiDanhSachSinhVien();
                    break;
                case 4:
                    timSinhVienTheoMa();
                    break;
                case 5:
                    xoaSinhVienTheoMa();
                    break;
                case 6:
                    tinhDiemTrungBinh();
                    break;
            }
        } while (choice != 0);
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
        dsSinhVien.add(new SinhVien(ma, ten, tuoi, gt));
    }

    public static void hienThiDanhSachSinhVien() {
        System.out.println("Danh Sách Sinh Viên");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            System.out.println(dsSinhVien.get(i).toString());
        }
    }

    public static SinhVien timSV(String ma) {
        for (SinhVien sv : dsSinhVien) {
            if (sv.getMaSV().equalsIgnoreCase(ma))
                return sv;
        }
        return null;
    }

    public static void timSinhVienTheoMa() {
        System.out.println("Nhap mã sinh vien cần tìm: ");
        String ma = sc.nextLine();
        SinhVien sv = timSV(ma);
        if (sv != null) {
            System.out.println(sv.toString());
        } else {
            System.out.println("Không tìm thấy sinh viên có mã: " + ma);
        }
    }

    public static void xoaSinhVienTheoMa() {
        System.out.println("Nhap mã sinh vien cần tìm: ");
        String ma = sc.nextLine();
        SinhVien sv = timSV(ma);
        if (sv != null) {
            dsSinhVien.remove(sv);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy sinh viên có mã: " + ma);
        }
    }

    public static void tinhDiemTrungBinh() {
        System.out.println("Nhap mã sinh vien cần tìm: ");
        String ma = sc.nextLine();
        SinhVien sv = timSV(ma);
        System.out.println("Nhap số lượng điểm: ");
        int so = sc.nextInt();
        for (int i = 0; i < so; i++) {
            System.out.println("Nhập điểm thứ " + (i + 1) + " :");
            double d = sc.nextDouble();
            sv.addDiem(d);
        }
        System.out.println("Điểm trung bình: " + sv.tinhDiemTrungBinh());
    }

    public static void phanBoHocVien() {
        System.out.print("Nhập mã sinh viên cần phân bổ: ");
        String ma = sc.nextLine();
        SinhVien sv = timSV(ma);
        System.out.println("Chọn giảng viên (0 = Thầy Minh): ");
        int indexGV = sc.nextInt();
        if(indexGV >= 0 &&  indexGV < dsGiangVien.size()) {
            dsGiangVien.get(indexGV).addHocVien(sv);
            System.out.println("Phân bổ thành công");
            dsGiangVien.get(indexGV).hienThiHocVien();
        }else {
            System.out.println("Giảng viên không tồn tại");
        }
    }
}