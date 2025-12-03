import java.util.ArrayList;

public class SinhVien extends ConNguoi {
    private String maSV;
    private ArrayList<Double> diem = new ArrayList<>();

    public String getMaSV() {
        return maSV;
    }

    public ArrayList<Double> getDiem() {
        return diem;
    }

    public SinhVien(String maSV, String ten, int tuoi, String gioitinh) {
        super(tuoi, ten, gioitinh);
        this.maSV = maSV;
    }

    public void addDiem(Double d) {
        diem.add(d);
    }

    public double tinhDiemTrungBinh() {
        if (diem.isEmpty()) {
            return 0;
        } else {
            double tong = 0;
            for (Double aDouble : diem) {
                tong += aDouble;
            }
            return tong / diem.size();
        }
    }

    @Override
    public String toString() {
        System.out.println("Mã sinh viên: " + maSV);
        return super.toString();
    }
}
