import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<NhanVien> danhSachNV = new ArrayList<>();
    static ArrayList<PhongBan> danhSachPB = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        danhSachPB.add(new PhongBan("IT", 1.5));
        danhSachPB.add(new PhongBan("Sales", 1.3));
        danhSachPB.add(new PhongBan("HR", 1.2));
        danhSachPB.add(new PhongBan("Marketing", 1.2));
        themNhanVienMau();
        int choice;
        do {
            System.out.println("1.Thêm nhan viên mới");
            System.out.println("3.Hiển thị danh sách nhân viên");
            System.out.println("4.Tìm Nhân viên theo tên");
            System.out.println("5.Tính lương thực tế của nhân viên");
            System.out.println("6.Tìm nhân viên có lương cao nhất");
            System.out.println("7.Cập nhật lương cơ bản");
            System.out.println("10.Tính Tổng lương");
            System.out.println("0.Thoát chương trinh");
            System.out.print("Chọn chương trình:");


            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    themNhanVienMoi();
                    break;

                case 3:
                    hienThiDanhSach();
                    break;

                case 4:
                    timTheoTen();
                    break;
                case 5:
                    tinhLuongThucTe();
                    break;
                case 6:
                    NhanVien nv = timNhanVienCoLuongCaoNhat();
                    System.out.println(nv.toString());
                    break;
                case 7:
                    capNhatLuongCoBan();
                    break;
                case 10:
                    tinhTongLuong();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    return;
            }

        } while (choice != 0);

    }

    public static void themNhanVienMoi() {
        sc.nextLine();
        System.out.println("Nhap mã nhan viên: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ten NV: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap luong co ban: ");
        double luong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Chon phong ban:");
        System.out.println("1. IT  2. Sales  3. HR  4. Marketing");
        System.out.print("Lua chon: ");
        int chon = sc.nextInt();
        String phongBan = "";
        switch (chon) {
            case 1:
                phongBan = "IT";
                break;
            case 2:
                phongBan = "Sales";
                break;
            case 3:
                phongBan = "HR";
                break;
            case 4:
                phongBan = "Marketing";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                return;
        }
        NhanVien nv = new NhanVien(ma, ten, tuoi, luong, phongBan);
        danhSachNV.add(nv);
        System.out.println("Thêm nhân viên thành công");
    }

    public static void themNhanVienMau() {
        danhSachNV.add(new NhanVien("NV001", "Nguyen Van A", 25, 10000000, "IT"));
        danhSachNV.add(new NhanVien("NV002", "Tran Thi B", 30, 12000000, "Sales"));
        danhSachNV.add(new NhanVien("NV003", "Le Van C", 28, 9000000, "IT"));
        danhSachNV.add(new NhanVien("NV004", "Pham Thi D", 26, 8000000, "HR"));
    }

    public static void hienThiDanhSach() {
        if (danhSachNV.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        }
        for (int i = 0; i < danhSachNV.size(); i++) {
            System.out.println(danhSachNV.get(i).toString());
        }
    }

    public static void timTheoTen() {
        sc.nextLine();
        System.out.println("Nhập tên cần tìm: ");
        String ten = sc.nextLine().toLowerCase();
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        for (NhanVien nv : danhSachNV) {
            if (nv.getTenNV().toLowerCase().contains(ten)) {
                ketQua.add(nv);
            }
        }
        if (ketQua.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        } else {
            for (NhanVien nv : ketQua) {
                System.out.println(nv.toString());
            }
        }
    }

    public static void tinhLuongThucTe() {
        sc.nextLine();
        System.out.println("Nhập mã nhân viên: ");
        String maNV = sc.nextLine();
        NhanVien nv = timNhanVienTheoMa(maNV);
        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên");
            return;
        }
        PhongBan pb = timPhongBan(nv.getPhongBan());
        if (pb != null) {
            double luongThucTe = nv.getLuongCB() * pb.getHeSoLuong();
            System.out.println("Luong thuc te cua " + nv.getTenNV() + ": " + (long) luongThucTe + " VND");
        }
    }


    public static void tinhTongLuong() {
        double tongLuong = 0;
        for (NhanVien nv : danhSachNV) {
            tongLuong += tinhLuongNhanVien(nv);
        }
        System.out.println("Tổng lương phải trả: " + (long) tongLuong);
    }


    public static NhanVien timNhanVienCoLuongCaoNhat() {
        NhanVien nv = danhSachNV.get(0);
        double max = tinhLuongNhanVien(nv);
        for (NhanVien nv1 : danhSachNV) {
            if (max < tinhLuongNhanVien(nv1)) {
                max = tinhLuongNhanVien(nv1);
                nv = nv1;
            }
        }
        return nv;
    }

    public static void capNhatLuongCoBan() {
        sc.nextLine();
        System.out.println("Nhap mã nhân viên: ");
        String maNV = sc.nextLine();
        NhanVien nv = timNhanVienTheoMa(maNV);
        if (nv == null) {
            System.out.println("Nhân viên không tồn tại");
            return;
        }
        System.out.println("Lương hiện tại: " + nv.getLuongCB());
        System.out.println("Cập nhật lương mới: ");
        double luongMoi = sc.nextDouble();
        nv.setLuongCB(luongMoi);
        System.out.println("Cập nhật thành công");
        System.out.println(nv.toString());
    }


    public static NhanVien timNhanVienTheoMa(String maNV) {
        for (NhanVien nv : danhSachNV) {
            if (nv.getMaNV().toLowerCase().equals(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public static PhongBan timPhongBan(String tenPB) {
        for (PhongBan pb : danhSachPB) {
            if (pb.getPhongBan().equals(tenPB)) {
                return pb;
            }
        }
        return null;
    }

    // Tính lương thực tế của 1 nhân viên
    public static double tinhLuongNhanVien(NhanVien nv) {
        PhongBan pb = timPhongBan(nv.getPhongBan());
        if (pb != null) {
            return nv.getLuongCB() * pb.getHeSoLuong();
        }
        return 0;
    }

}