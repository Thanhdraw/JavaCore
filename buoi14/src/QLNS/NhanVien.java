package QLNS;

public class NhanVien extends NhanSu {

    private static final double LUONG_1_NGAY=100;
    private TruongPhong truongPhong;

    public NhanVien(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.truongPhong = null;
    }

    @Override
    public double tinhLuong() {
        return LUONG_1_NGAY * soNgayLamViec;
    }

    @Override
    public void xuatThongTin() {
        String tenTP = (truongPhong != null) ? truongPhong.getHoTen() : "Không có";
        System.out.printf("%-15s %-20s %-15s %-10d %-15s TP: %-20s\n",
                maSo, hoTen, soDienThoai, soNgayLamViec, "Nhân viên", tenTP);
    }

    public TruongPhong getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(TruongPhong truongPhong) {
        this.truongPhong = truongPhong;
    }
}
