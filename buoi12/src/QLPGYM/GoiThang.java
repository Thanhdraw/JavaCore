package QLPGYM;

public class GoiThang extends HoiVien{

    private final double gia = 500000;

    public GoiThang(String ten) {
        super(ten, "Gói tháng");
    }


    @Override
    public double tinhTienGoiTap() {
        return gia;
    }
    @Override
    public String toString() {
        return super.toString() + ", Tiền: " + tinhTienGoiTap() + "đ";
    }
}
