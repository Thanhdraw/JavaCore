package QLNV;

public class NhanVienPartTime extends NhanVien{
    private double soGio;
    private double luongMoiGio;


    public NhanVienPartTime(String name, int tuoi, double soGio, double luongMoiGio) {
        super(name, tuoi, 0);
        this.soGio = soGio;
        this.luongMoiGio = luongMoiGio;
    }
    public double getSoGio() {
        return soGio;
    }
    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }
    public double getLuongMoiGio() {
        return luongMoiGio;
    }
    public void setLuongMoiGio(double luongMoiGio) {
        this.luongMoiGio = luongMoiGio;
    }

    @Override
    public double tinhLuong() {
        return getSoGio() * getLuongMoiGio();
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + this.tinhLuong());
    }
}
