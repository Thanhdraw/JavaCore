package phan3;

public class XeMay extends PhuongTienGiaoThong{
    private int year;
    private String brand;
    public XeMay(String color,int year, String brand) {
        super(color);
        this.year = year;
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void displayInfo() {
        System.out.println("Xe hãng: " + this.brand);
        System.out.println("Sản xuất năm: " + this.year);
        super.displayInfo();
    }
}
