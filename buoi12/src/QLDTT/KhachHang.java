package QLDTT;

public abstract class KhachHang {
    private String tenKhachHang;
    private double soDienTieuThu;

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public double getSoDienTieuThu() {
        return soDienTieuThu;
    }

    public void setSoDienTieuThu(double soDienTieuThu) {
        this.soDienTieuThu = soDienTieuThu;
    }

    public KhachHang(String tenKhachHang, double soDienTieuThu) {
        this.tenKhachHang = tenKhachHang;
        this.soDienTieuThu = soDienTieuThu;
    }

    public String getThongTin() {
        return "Tên khách hàng: " + tenKhachHang + " số điện tiêu thụ: " + soDienTieuThu;
    }

    public abstract double tinhTienDien();




}
