package QLNS;

public class TruongPhong extends NhanSu {
    private static final double LUONG_1_NGAY = 200;
    private int soNhanVien;

    public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.soNhanVien = 0;
    }

    @Override
    public double tinhLuong() {
        return LUONG_1_NGAY * soNgayLamViec + 100 * soNhanVien;
    }

    @Override
    public void xuatThongTin() {
        System.out.printf("%-15s %-20s %-15s %-10d %-15s Số NV: %-20d\n",
                maSo, hoTen, soDienThoai, soNgayLamViec, "Trưởng phòng", soNhanVien);
    }

    public void tangSoNhanVien() {
        soNhanVien++;
    }

    public void giamSoNhanVien() {
        if (soNhanVien > 0) soNhanVien--;
    }
    public int getSoNhanVien() {
        return soNhanVien;
    }
}
