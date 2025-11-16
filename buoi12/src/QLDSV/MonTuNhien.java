package QLDSV;

public class MonTuNhien extends MonHoc {


    public MonTuNhien(String tenMon, double diemGiuaKy, double diemCuoiKy) {
        super(tenMon, diemGiuaKy, diemCuoiKy);
    }

    @Override
    public double tinhDiemTongKet() {
        double diemtongket = getDiemGiuaKy() * 0.4 + getDiemCuoiKy() * 0.6;
        return diemtongket;
    }

    @Override
    public String toString() {
        return "Môn tự nhiên: " + getThongTin();
    }
}
