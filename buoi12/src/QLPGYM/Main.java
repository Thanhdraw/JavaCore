package QLPGYM;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HoiVien> hoiVienList = new ArrayList<>();
        hoiVienList.add(new GoiThang("Thành"));
        hoiVienList.add(new GoiNgay("Thành",10));
        double tongDoanhThu = 0;
        for (HoiVien hoiVien : hoiVienList) {
            tongDoanhThu += hoiVien.tinhTienGoiTap();
            System.out.println(hoiVien.toString());

        }
        System.out.println("Tổng doanh thu phòng gym: " + tongDoanhThu + "đ");
    }
}
