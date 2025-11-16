package QLPGYM;

public abstract class HoiVien {
    private String ten;
    private String loaiGoi;

    public HoiVien(String ten, String loaiGoi) {
        this.ten = ten;
        this.loaiGoi = loaiGoi;
    }

    public String getTen() {
        return ten;
    }

    public String getLoaiGoi() {
        return loaiGoi;
    }

    public abstract double tinhTienGoiTap();

    @Override
    public String toString() {
        return "Tên: " + ten + ", Loại gói: " + loaiGoi;
    }
}
