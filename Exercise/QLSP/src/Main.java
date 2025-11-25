import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSanPham qlSanPham = new QLSanPham();
        int choice;
        do {

            System.out.println("1.Nhập thong tin sản phẩm: ");
            System.out.println("2.In danh sách sản phẩm");
            System.out.println("3.Nhap mã san phẩm cần tìm");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    qlSanPham.themSanPham();
                    break;

                case 2:
                    qlSanPham.inDanhSachSanPham();
                    break;
                case 3:
                    System.out.println("Nhap mã SP cần tìm: ");
                    String maSP = sc.next();
                    SanPham sp = qlSanPham.timMaSanPham(maSP);
                    if (sp != null) {
                        System.out.println(sp.toString());
                    } else
                        System.out.println("Danh sach trống");
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");


            }


        } while (choice != 0);
    }
}