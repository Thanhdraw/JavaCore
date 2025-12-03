package QLSV;

import java.util.ArrayList;

public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private String goitinh;

    private ArrayList<Double> diem = new ArrayList<>();

    public ArrayList<Double> getDiem() {
        return diem;
    }

    public void setDiem(ArrayList<Double> diem) {
        this.diem = diem;
    }

    public SinhVien(String maSV, String ten, int tuoi, String goitinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.goitinh = goitinh;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGoitinh() {
        return goitinh;
    }

    public void setGoitinh(String goitinh) {
        this.goitinh = goitinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
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
            for (double d : diem) {
                tong += d;
            }
            return tong / diem.size();
        }
    }


    public String toString() {
        return maSV + " - " + ten + " - Tuổi: " + tuoi +
                " - Giới tính: " + goitinh +
                " - ĐTB: " + tinhDiemTrungBinh();
    }

}
