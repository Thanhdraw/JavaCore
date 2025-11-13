package QLNV;

public abstract class NhanVien {
    private String name;
    private int tuoi;
    private double luongcoban;

    public NhanVien(String name, int tuoi, double luongcoban) {
        this.name = name;
        this.tuoi = tuoi;
        this.luongcoban = luongcoban;
    }

    public String getName() {
        return name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public abstract double tinhLuong();

    public void displayInfo() {
        System.out.println("Nhan viên có tên: " + this.name + " tuổi là: " + this.tuoi + "Lương là: " + this.luongcoban);
    }
}
