import java.util.ArrayList;

public class PhongBan {
    private String phongBan;
    private double heSoLuong;
    private ArrayList<NhanVien> danhsachNhanVien;

    public PhongBan(String phongBan, double heSoLuong) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.danhsachNhanVien = new ArrayList<>();
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public ArrayList<NhanVien> getDanhsachNhanVien() {
        return danhsachNhanVien;
    }

    public void themNhanVien(NhanVien nhanVien) {
        this.danhsachNhanVien.add(nhanVien);
    }
    public int demSoLuong() {
        return this.danhsachNhanVien.size();
    }
}
