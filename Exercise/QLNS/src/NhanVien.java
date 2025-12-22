public class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private double luongCB;
    private String phongBan;

    public NhanVien(String maNV, String tenNV, int tuoi, double luongCB, String phongBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.luongCB = luongCB;
        this.phongBan = phongBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + this.maNV + " | Tên nhân viên: " + this.tenNV +
                " | tuổi: " + this.tuoi + "| Lương cơ bản: " + (long) this.luongCB + " | Phòng ban: " + this.phongBan;
    }
}
