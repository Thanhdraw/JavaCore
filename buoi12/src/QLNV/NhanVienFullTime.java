package QLNV;

public class NhanVienFullTime extends NhanVien {
    private double hesoluong;

    public NhanVienFullTime(String name, int tuoi, double luongcoban, double hesoluong) {
        super(name, tuoi, luongcoban);
        this.hesoluong = hesoluong;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    @Override
    public double tinhLuong() {
        return getHesoluong() * super.getLuongcoban();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + this.tinhLuong());
    }
}
