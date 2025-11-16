package QLPTGT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PhuongTien> danhSach = new ArrayList<>();
        danhSach.add(new XeMay("Honda Future", 2018, 30000000));
        danhSach.add(new XeMay("Yamaha Exciter", 2023, 50000000));
        danhSach.add(new Oto("Toyota Camry", 2020, 1000000000));
        danhSach.add(new Oto("Mazda 3", 2024, 750_000_000));
        for (PhuongTien p : danhSach) {
            System.out.println(p.toString());
            double giaKM = p.tinhGiaSauKhuyenMai();

            System.out.println("=> Giá sau khuyến mãi: " + String.format("%,.0f", giaKM) + " VNĐ");
        }
    }
}
