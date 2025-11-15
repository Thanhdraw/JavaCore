package QLHH;

public class HinhTron extends HinhHoc {
    private double bankinh;
    public static final double PI = 3.14;


    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.pow(bankinh, 2) * PI;
    }

    @Override
    public double tinhChuvi() {
        return 2 * bankinh * PI;
    }
}
