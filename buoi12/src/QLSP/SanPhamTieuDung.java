package QLSP;

public class SanPhamTieuDung extends SanPham {

    private double discount;

    public SanPhamTieuDung(String nameProduct, double price, double discount)
    {
        super(nameProduct, price);
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double priceCaculation() {
        return super.getPrice() - super.getPrice() * this.discount;
    }
}
