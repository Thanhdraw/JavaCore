import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Sach> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        list.add(new Sach("MS001", "Sách A", "Tác giả A", 2001, 15000));
        list.add(new Sach("MS002", "Sách B", "Tác giả B", 2005, 20000));
        list.add(new Sach("MS003", "Sách C", "Tác giả C", 2010, 25000));
        list.add(new Sach("MS004", "Sách D", "Tác giả D", 2015, 30000));
        list.add(new Sach("MS005", "Sách E", "Tác giả E", 2020, 35000));


        int choice;
        do {

            System.out.println("1.Nhập thông tin sách");
            System.out.println("2.In danh sách");
            System.out.println("3.Tìm mã sách");
            System.out.println("4.Xóa mã sách");
            System.out.println("5.Tổng số sách");
            System.out.println("0.Kết thúc chương trình");
            System.out.print("Chọn chương trình:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    nhapThongTinSach();
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3:
                    System.out.println("Nhap thong tin ma sach: ");
                    String maSach = sc.next();
                    Sach sach = timMaSach(maSach);
                    System.out.println(sach.toString());
                    break;
                case 4:
                    if (xoaSach())
                        System.out.println("Xóa thành công");
                    else
                        System.out.println("Xóa thất bại");

                    break;
                case 5:
                    int diem = diemSach();
                    System.out.println("Tổng số sách là: " + diem);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trình");
                    return;

                default:
                    System.out.println("Lỗi chương trình");
            }

        } while (choice != 0);
    }

    public static void nhapThongTinSach() {
        sc.nextLine();
        System.out.println("Nhập mã sách: ");
        String ma = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tác giả: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhap nam XB: ");
        int nam = sc.nextInt();
        System.out.println("Nhap gia tien");
        double giaTien = sc.nextDouble();
        list.add(new Sach(ma, ten, tacGia, nam, giaTien));
    }

    public static void inDanhSach() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static Sach timMaSach(String maSach) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSach().equals(maSach)) {
                return list.get(i);
            }
        }
        return null;
    }

    public static boolean xoaSach() {
        sc.nextLine();
        System.out.println("Nhap ma sach can xóa: ");
        String maSach = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSach().toUpperCase().equalsIgnoreCase(maSach)) {
                list.remove(i);
                return true;
            }
        }
        return false;

    }

    public static int diemSach() {
        int count = 0;
        for (Sach sach : list) {
            count++;
        }
        return count;
    }
}