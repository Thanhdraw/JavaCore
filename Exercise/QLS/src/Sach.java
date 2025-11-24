public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private double giaTien;

    public Sach(String maSach, String tenSach, String tacGia, int namXB, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Ma sach: " + this.maSach + "Ten sach: " + this.tenSach + "Tac gia: " + this.tacGia + "NamXB: " + this.namXB + "GiaTien: " + this.giaTien;
    }
}
