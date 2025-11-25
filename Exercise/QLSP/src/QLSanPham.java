import java.util.ArrayList;
import java.util.Scanner;

public class QLSanPham {
    private ArrayList<SanPham> sanPhams = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void themSanPham() {
        System.out.println("Nhap mã sản phẩm: ");
        String maSP = sc.nextLine();
        if (timMaSanPham(maSP) != null) {
            System.out.println("Đã tồn tại mã sp: " + maSP);
            return;
        }
        System.out.println("Nhập tên sản phẩm: ");
        String tenSP = sc.nextLine();
        System.out.println("Nhap gia sp: ");
        double gia = sc.nextDouble();
        System.out.println("Nhap soLuong: ");
        int soLuong = sc.nextInt();
        sanPhams.add(new SanPham(maSP, tenSP, gia, soLuong));
    }

    public void inDanhSachSanPham() {
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham.toString());
        }
    }

    public SanPham timMaSanPham(String maSP) {
        for (SanPham sp : sanPhams) {
            if (sp.getMaSP().equalsIgnoreCase(maSP)) {
                return sp;
            }
        }
        return null;
    }
}
