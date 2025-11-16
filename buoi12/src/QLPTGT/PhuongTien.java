package QLPTGT;

import java.time.Year;

public abstract class PhuongTien {
    private String brand;
    private int year;
    private double price;

    public PhuongTien(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected int getNamHienTai() {
        return Year.now().getValue();
    }

    public String getThongTin() {
        return "Hãng: " + brand + ", Năm SX: " + year + ", Giá Gốc: " + String.format("%,.0f", price) + " VNĐ";
    }

    public abstract double tinhGiaSauKhuyenMai();
}
