import java.util.ArrayList;

public class GiangVien extends Mentor {
    private ArrayList<SinhVien> danhSachHocVien = new ArrayList<>();
    public GiangVien(int tuoi, String ten, String gioitinh, double luong) {
        super(tuoi, ten, gioitinh, luong);
    }
    public void addHocVien(SinhVien sv) {
        danhSachHocVien.add(sv);
    }
    public void hienThiHocVien() {
        System.out.println("Danh sách học viên của giảng viên " + ten + ":");
        for (SinhVien sv : danhSachHocVien) {
            System.out.println(" - " + sv.toString());
        }
    }
}
