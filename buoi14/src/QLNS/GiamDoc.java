package QLNS;

public class GiamDoc extends NhanSu {
    private static final double LUONG_1_NGAY = 300;
    private double coPhan;

    public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec);
        this.coPhan = (coPhan > 100) ? 100 : coPhan;
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * LUONG_1_NGAY;
    }

    @Override
    public void xuatThongTin() {
        System.out.printf("%-15s %-20s %-15s %-10d %-15s Cổ phần: %.2f%%\n",
                maSo, hoTen, soDienThoai, soNgayLamViec, "Giám đốc", coPhan);
    }

    public double getCoPhan() {
        return coPhan;
    }
}
