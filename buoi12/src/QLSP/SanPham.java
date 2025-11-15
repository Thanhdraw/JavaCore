package QLSP;

public abstract class SanPham {
    private String nameProduct;
    private double price;
    public SanPham(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double priceCaculation();
}
