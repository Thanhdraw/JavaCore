package QLPTGT;

public class XeMay extends PhuongTien {
    public XeMay(String brand, int year, double price) {
        super(brand, year, price);
    }

    @Override
    public double tinhGiaSauKhuyenMai() {
        int sonamsudung = getNamHienTai() - this.getYear();
        if (sonamsudung > 5) {
            return getPrice() * 0.95;
        }
        return getPrice();
    }
    @Override
    public String toString() {
        return "[Xe Máy] " + getThongTin();
    }
}
