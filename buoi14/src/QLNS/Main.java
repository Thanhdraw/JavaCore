package QLNS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongTy congTy = new CongTy();
        int chon;

        do {
            System.out.println("\n========== QUẢN LÝ NHÂN SỰ ==========");
            System.out.println("1. Nhập thông tin công ty");
            System.out.println("2. Phân bổ Nhân viên vào Trưởng phòng");
            System.out.println("3. Thêm nhân sự");
            System.out.println("4. Xóa nhân sú");
            System.out.println("5. Xuất thông tin toàn bộ nhân sự");
            System.out.println("6. Tính và xuất tổng lương");
            System.out.println("7. Tìm Nhân viên lương cao nhất");
            System.out.println("8. Tìm Trưởng phòng có nhiều nhân viên nhất");
            System.out.println("9. Sắp xếp nhân sự theo tên (ABC)");
            System.out.println("10. Sắp xếp nhân sự theo lương giảm dần");
            System.out.println("11. Tìm Giám đốc có cổ phần nhiều nhất");
            System.out.println("12. Tính và xuất thu nhập Giám đốc");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    congTy.nhapThongTin(sc);
                    break;
                case 2:
                    congTy.phanBoNhanVien(sc);
                    break;
                case 3:
                    themNhanSu(sc, congTy);
                    break;
                case 4:
                    System.out.print("Nhập mã số nhân sự cần xóa: ");
                    String maSoXoa = sc.nextLine();
                    congTy.xoaNhanSu(maSoXoa);
                    break;
                case 5:
                    congTy.xuatThongTinToanBo();
                    break;
                case 6:
                    congTy.xuatTongLuong();
                    break;
                case 7:
                    congTy.timNhanVienLuongCaoNhat();
                    break;
                case 8:
                    congTy.timTruongPhongNhieuNhanVienNhat();
                    break;
                case 9:
                    congTy.sapXepTheoTen();
                    break;
                case 10:
                    congTy.sapXepTheoLuong();
                    break;
                case 11:
                    congTy.timGiamDocCoPhanNhieuNhat();
                    break;
                case 12:
                    congTy.tinhThuNhapGiamDoc();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);

        sc.close();
    }

    public static void themNhanSu(Scanner sc, CongTy congTy) {
        System.out.println("\n--- THÊM NHÂN SỰ ---");
        System.out.println("1. Nhân viên");
        System.out.println("2. Trưởng phòng");
        System.out.println("3. Giám đốc");
        System.out.print("Chọn loại nhân sự: ");
        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập mã số: ");
        String maSo = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();
        System.out.print("Nhập số ngày làm việc: ");
        int soNgay = sc.nextInt();
        sc.nextLine();

        switch (loai) {
            case 1:
                congTy.themNhanSu(new NhanVien(maSo, hoTen, sdt, soNgay));
                System.out.println("Đã thêm nhân viên thành công!");
                break;
            case 2:
                congTy.themNhanSu(new TruongPhong(maSo, hoTen, sdt, soNgay));
                System.out.println("Đã thêm trưởng phòng thành công!");
                break;
            case 3:
                System.out.print("Nhập cổ phần (%): ");
                double coPhan = sc.nextDouble();
                sc.nextLine();
                congTy.themNhanSu(new GiamDoc(maSo, hoTen, sdt, soNgay, coPhan));
                System.out.println("Đã thêm giám đốc thành công!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
