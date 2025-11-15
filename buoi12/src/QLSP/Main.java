package QLSP;

public class Main {
    public static void main(String[] args) {
        SanPham[] sanPham = {
                new SanPhamDienTu("Máy Lạnh", 10000000, 0.025),
                new SanPhamTieuDung("Nước ngọt", 8000, 0.02)
        };
        for (SanPham s : sanPham) {
            System.out.println("Giá bán sản Phẩm là: " + (long) s.priceCaculation());

        }
    }
}
