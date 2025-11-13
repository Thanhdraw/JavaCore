package QLHS;

public class HocSinhCap3 extends HocSinh {

    public HocSinhCap3(String name, double math, double lit) {
        super(name, math, lit);
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (super.getMath() * 2 + super.getLit()) / 3;
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
