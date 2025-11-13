package QLHS;

public class HocSinhCap1 extends HocSinh {

    public HocSinhCap1(String name, double math, double lit) {
        super(name, math, lit);
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (super.getMath() + super.getLit()) / 2;
    }

    @Override
    public String getRank() {
        if (tinhDiemTrungBinh() >= 9)
            return "Xuất sắc";
        else if (tinhDiemTrungBinh() >= 8 && tinhDiemTrungBinh() < 9)
            return "Giỏi";
        else if (tinhDiemTrungBinh() >= 7 && tinhDiemTrungBinh() < 8)
            return "Khá";
        else if (tinhDiemTrungBinh() >= 5 && tinhDiemTrungBinh() < 7)
            return "TB";
        else
            return "Yếu";
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Điểm trung bình: %.2f  Xếp loại: %s%n", tinhDiemTrungBinh(), getRank());
    }

}
