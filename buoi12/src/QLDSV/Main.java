package QLDSV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MonHoc> monHoc = new ArrayList<>();
        monHoc.add(new MonTuNhien("Vật ly", 8, 9));
        monHoc.add(new MonXaHoi("GDCD", 7, 8));
        for (MonHoc monHoc1 : monHoc) {
            System.out.println(monHoc1.toString());
            System.out.println("Điểm tổng kết: " + monHoc1.tinhDiemTongKet());
        }
    }
}
