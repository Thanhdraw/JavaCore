package QLPTGT;

public class Oto extends PhuongTien {


    public Oto(String brand, int year, double price) {
        super(brand, year, price);
    }

    @Override
    public double tinhGiaSauKhuyenMai() {
        int sonamsudung = getNamHienTai() - getYear();
        if (sonamsudung > 3) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }

    @Override
    public String toString() {
        return "[Oto] " + getThongTin();
    }
}
