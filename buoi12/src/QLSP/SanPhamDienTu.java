package QLSP;

public class SanPhamDienTu extends SanPham {

    private double vat;

    public SanPhamDienTu(String nameProduct, double price, double vat) {
        super(nameProduct, price);
        this.vat = vat;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public double priceCaculation() {
        return super.getPrice() + super.getPrice() * this.vat;
    }
}
