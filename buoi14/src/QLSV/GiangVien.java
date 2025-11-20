package QLSV;

import java.util.ArrayList;

public class GiangVien extends Mentor {

    private ArrayList<SinhVien> danhsachHocVien = new ArrayList<SinhVien>();

    public void addHocVien(SinhVien sinhVien) {
        danhsachHocVien.add(sinhVien);
    }

    public void hienthiHocVien() {
        System.out.println("Danh sách học viên của giảng viên " + ten + ":");
        for (SinhVien sinhVien : danhsachHocVien) {
            System.out.println(sinhVien.toString());
        }
    }
    public GiangVien(String ten, int tuoi, String gioitinh, double luong) {
        super(ten, tuoi, gioitinh, luong);
    }
}
