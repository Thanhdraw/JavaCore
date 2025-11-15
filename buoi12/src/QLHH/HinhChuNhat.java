package QLHH;

public class HinhChuNhat extends HinhHoc {

    private double chieudai;
    private double chieurong;

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public double tinhDienTich() {
        return chieurong * chieudai;
    }

    @Override
    public double tinhChuvi() {
        return (chieudai + chieurong) * 2;
    }
}
