package QLPGYM;

public class GoiNgay extends HoiVien {
    private int soNgay;
    private final double giaMotNgay = 30000;

    public GoiNgay(String ten, int soNgay) {
        super(ten, "Goi Ngày");
        this.soNgay = soNgay;
    }

    @Override
    public double tinhTienGoiTap() {
        return soNgay * giaMotNgay;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số ngày: " + soNgay + ", Tiền: " + tinhTienGoiTap() + "đ";
    }
}
