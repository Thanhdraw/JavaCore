package QLDSV;

public class MonXaHoi extends MonHoc {

    public MonXaHoi(String tenMon, double diemGiuaKy, double diemCuoiKy) {
        super(tenMon, diemGiuaKy, diemCuoiKy);
    }

    @Override
    public double tinhDiemTongKet() {
        double diemtongket = getDiemGiuaKy() * 0.5 + getDiemCuoiKy() * 0.5;
        return diemtongket;
    }

    @Override
    public String toString() {
        return "Môn Xã Hội: " + getThongTin();
    }
}
