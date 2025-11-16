package QLDTT;

public class KhachHangSinhHoat extends KhachHang {

    public static final double TIEN_SINH_HOAT = 3000;

    public KhachHangSinhHoat(String tenKhachHang, double soDienTieuThu) {
        super(tenKhachHang, soDienTieuThu);
    }

    @Override
    public double tinhTienDien() {
        return getSoDienTieuThu() * TIEN_SINH_HOAT;
    }

    @Override
    public String toString() {
        return "Khach Hang Sinh Hoat" + getThongTin();
    }
}
