package QLDTT;

public class KhachHangKinhDoanh extends KhachHang {

    public static final double KH_KINH_DOANH = 5000;

    public KhachHangKinhDoanh(String tenKhachHang, double soDienTieuThu) {
        super(tenKhachHang, soDienTieuThu);
    }


    @Override
    public double tinhTienDien() {
        return getSoDienTieuThu() * KH_KINH_DOANH;
    }

    @Override
    public String toString() {
        return "Khach Hang Kinh Doanh" + getThongTin();
    }
}
