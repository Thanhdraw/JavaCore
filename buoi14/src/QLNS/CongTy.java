package QLNS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CongTy {
    private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    private ArrayList<NhanSu> danhSachNhanSu;

    public CongTy() {
        danhSachNhanSu = new ArrayList<>();
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập tên công ty: ");
        tenCongTy = sc.nextLine();
        System.out.print("Nhập mã số thuế: ");
        maSoThue = sc.nextLine();
        System.out.print("Nhập doanh thu tháng: ");
        doanhThuThang = sc.nextDouble();
        sc.nextLine();
    }

    public void themNhanSu(NhanSu ns) {
        danhSachNhanSu.add(ns);
    }

    public void xoaNhanSu(String maSo) {
        NhanSu nsCanXoa = timNhanSuTheoMa(maSo);
        if (nsCanXoa == null) {
            System.out.println("Không tìm thấy nhân sự với mã số: " + maSo);
            return;
        }

        // Nếu xóa trưởng phòng, ngắt liên kết với nhân viên
        if (nsCanXoa instanceof TruongPhong) {
            for (NhanSu ns : danhSachNhanSu) {
                if (ns instanceof NhanVien) {
                    NhanVien nv = (NhanVien) ns;
                    if (nv.getTruongPhong() == nsCanXoa) {
                        nv.setTruongPhong(null);
                    }
                }
            }
        }

        danhSachNhanSu.remove(nsCanXoa);
        System.out.println("Đã xóa nhân sự thành công!");
    }

    public NhanSu timNhanSuTheoMa(String maSo) {
        for (NhanSu ns : danhSachNhanSu) {
            if (ns.getMaSo().equals(maSo)) {
                return ns;
            }
        }
        return null;
    }

    public void phanBoNhanVien(Scanner sc) {
        System.out.print("Nhập mã số nhân viên: ");
        String maNV = sc.nextLine();
        System.out.print("Nhập mã số trưởng phòng: ");
        String maTP = sc.nextLine();

        NhanSu nhanSu = timNhanSuTheoMa(maNV);
        NhanSu truongPhong = timNhanSuTheoMa(maTP);

        if (nhanSu == null || !(nhanSu instanceof NhanVien)) {
            System.out.println("Không tìm thấy nhân viên!");
            return;
        }
        if (truongPhong == null || !(truongPhong instanceof TruongPhong)) {
            System.out.println("Không tìm thấy trưởng phòng!");
            return;
        }

        NhanVien nv = (NhanVien) nhanSu;
        TruongPhong tp = (TruongPhong) truongPhong;

        // Xóa liên kết cũ nếu có
        if (nv.getTruongPhong() != null) {
            ((TruongPhong) nv.getTruongPhong()).giamSoNhanVien();
        }

        nv.setTruongPhong(tp);
        tp.tangSoNhanVien();
        System.out.println("Phân bổ thành công!");
    }

    public void xuatThongTinToanBo() {
        System.out.println("\n========== THÔNG TIN TOÀN BỘ NHÂN SỰ ==========");
        System.out.println("Công ty: " + tenCongTy + " - MST: " + maSoThue);
        System.out.printf("%-5s %-15s %-20s %-15s %-10s %-15s %-20s\n",
                "STT", "Mã số", "Họ tên", "SĐT", "Ngày LV", "Chức vụ", "Thông tin thêm");
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (int i = 0; i < danhSachNhanSu.size(); i++) {
            System.out.printf("%-5d ", (i + 1));
            danhSachNhanSu.get(i).xuatThongTin();
        }
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (NhanSu ns : danhSachNhanSu) {
            tong += ns.tinhLuong();
        }
        return tong;
    }

    public void xuatTongLuong() {
        System.out.println("\n========== TỔNG LƯƠNG CÔNG TY ==========");
        System.out.printf("Tổng lương: %.2f VNĐ\n", tinhTongLuong());
    }

    public void timNhanVienLuongCaoNhat() {
        NhanVien nvMax = null;
        double luongMax = 0;

        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof NhanVien && !(ns instanceof TruongPhong)) {
                if (ns.tinhLuong() > luongMax) {
                    luongMax = ns.tinhLuong();
                    nvMax = (NhanVien) ns;
                }
            }
        }

        if (nvMax != null) {
            System.out.println("\n========== NHÂN VIÊN LƯƠNG CAO NHẤT ==========");
            System.out.printf("%-5s %-15s %-20s %-15s %-10s %-15s\n",
                    "STT", "Mã số", "Họ tên", "SĐT", "Ngày LV", "Lương");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.printf("%-5d ", 1);
            nvMax.xuatThongTin();
            System.out.printf("Lương: %.2f VNĐ\n", luongMax);
        } else {
            System.out.println("Không có nhân viên thường nào!");
        }
    }

    public void timTruongPhongNhieuNhanVienNhat() {
        TruongPhong tpMax = null;
        int soNVMax = 0;

        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof TruongPhong) {
                TruongPhong tp = (TruongPhong) ns;
                if (tp.getSoNhanVien() > soNVMax) {
                    soNVMax = tp.getSoNhanVien();
                    tpMax = tp;
                }
            }
        }

        if (tpMax != null) {
            System.out.println("\n========== TRƯỞNG PHÒNG CÓ NHIỀU NHÂN VIÊN NHẤT ==========");
            System.out.printf("%-5s %-15s %-20s %-15s %-10s %-20s\n",
                    "STT", "Mã số", "Họ tên", "SĐT", "Ngày LV", "Số NV dưới quyền");
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.printf("%-5d ", 1);
            tpMax.xuatThongTin();
        } else {
            System.out.println("Không có trưởng phòng nào!");
        }
    }

    public void sapXepTheoTen() {
        Collections.sort(danhSachNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu ns1, NhanSu ns2) {
                return ns1.getHoTen().compareToIgnoreCase(ns2.getHoTen());
            }
        });
        System.out.println("Đã sắp xếp theo tên ABC!");
        xuatThongTinToanBo();
    }

    public void sapXepTheoLuong() {
        Collections.sort(danhSachNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu ns1, NhanSu ns2) {
                return Double.compare(ns2.tinhLuong(), ns1.tinhLuong());
            }
        });
        System.out.println("Đã sắp xếp theo lương giảm dần!");
        xuatThongTinToanBo();
    }

    public void timGiamDocCoPhanNhieuNhat() {
        GiamDoc gdMax = null;
        double coPhanMax = 0;

        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) ns;
                if (gd.getCoPhan() > coPhanMax) {
                    coPhanMax = gd.getCoPhan();
                    gdMax = gd;
                }
            }
        }

        if (gdMax != null) {
            System.out.println("\n========== GIÁM ĐỐC CÓ CỔ PHẦN NHIỀU NHẤT ==========");
            System.out.printf("%-5s %-15s %-20s %-15s %-10s %-15s\n",
                    "STT", "Mã số", "Họ tên", "SĐT", "Ngày LV", "Cổ phần");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.printf("%-5d ", 1);
            gdMax.xuatThongTin();
        } else {
            System.out.println("Không có giám đốc nào!");
        }
    }

    public void tinhThuNhapGiamDoc() {
        double loiNhuan = doanhThuThang - tinhTongLuong();
        System.out.println("\n========== THU NHẬP CÁC GIÁM ĐỐC ==========");
        System.out.printf("Lợi nhuận công ty: %.2f VNĐ\n", loiNhuan);
        System.out.printf("%-5s %-15s %-20s %-15s %-15s %-20s\n",
                "STT", "Mã số", "Họ tên", "Cổ phần", "Lương", "Thu nhập");
        System.out.println("--------------------------------------------------------------------------------------------");

        int stt = 1;
        for (NhanSu ns : danhSachNhanSu) {
            if (ns instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) ns;
                double luong = gd.tinhLuong();
                double thuNhap = luong + (gd.getCoPhan() / 100) * loiNhuan;
                System.out.printf("%-5d %-15s %-20s %-15.2f%% %-15.2f %-20.2f\n",
                        stt++, gd.getMaSo(), gd.getHoTen(), gd.getCoPhan(), luong, thuNhap);
            }
        }
    }

    public ArrayList<NhanSu> getDanhSachNhanSu() {
        return danhSachNhanSu;
    }
}
