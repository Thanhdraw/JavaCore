package QLDTT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KhachHang> khachHangList = new ArrayList<>();
        khachHangList.add(new KhachHangSinhHoat("Thanh", 5.5));
        khachHangList.add(new KhachHangKinhDoanh("Thanh", 10));

        for (KhachHang khachHang : khachHangList) {
            System.out.println(khachHang.toString());
            System.out.println("Tổng tiền điện khách hàng là: " + khachHang.tinhTienDien());
        }
    }
}
