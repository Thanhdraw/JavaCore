package QLDSV;

public abstract class MonHoc {
    private String tenMon;
    private double diemGiuaKy;
    private double diemCuoiKy;

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }

    public MonHoc(String tenMon, double diemGiuaKy, double diemCuoiKy) {
        this.tenMon = tenMon;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
    }

    public abstract double tinhDiemTongKet();

    public String getThongTin() {
        return "Tên môn: " + tenMon + ", điểm giữa kỳ: " + diemGiuaKy + ", điểm cuối kỳ: " + diemCuoiKy;
    }

}
