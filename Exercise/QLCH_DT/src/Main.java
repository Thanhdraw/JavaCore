import java.sql.SQLOutput;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<DienThoai> danhsach = new ArrayList<DienThoai>();
        danhsach.add(new DienThoai("iPhone 15", 20000000, 5));
        danhsach.add(new DienThoai("Samsung S24", 18000000, 3));
        danhsach.add(new DienThoai("Xiaomi 14", 12000000, 7));
        System.out.println("=== BƯỚC 3: DUYỆT ARRAYLIST (for-each) ===\n");
        for (DienThoai dt : danhsach) {
            dt.hienThi();
        }
        System.out.println("\n=== BƯỚC 4: TRUY CẬP PHẦN TỬ (.get) ===\n");
        DienThoai dautien = danhsach.get(0);
        dautien.hienThi();
        DienThoai cuoicung = danhsach.get(danhsach.size() - 1);
        cuoicung.hienThi();
        System.out.println("\n=== BƯỚC 5: TÌM KIẾM ===\n");
        String tukhoa = "Samsung";
        boolean timthay = false;
        for (DienThoai dt : danhsach) {
            if (dt.ten.contains(tukhoa)) {
                dt.hienThi();
                timthay = true;
            }
        }
        if (!timthay) {
            System.out.println("❌ Không tìm thấy!");
        }

        System.out.println("\n=== BƯỚC 6: TÍNH TỔNG GIÁ TRỊ ===\n");
        double sum = 0;
        for (DienThoai dt : danhsach) {
            sum += dt.gia * dt.soLuong;
        }
        System.out.println("Tổng giá trị: " + (long) sum);
        System.out.println("=== BƯỚC 7: TÌM ĐIỆN THOẠI ĐẮT NHẤT ===\n");
        DienThoai datnhat = danhsach.get(0);
        for (DienThoai dt : danhsach) {
            if (dt.gia > datnhat.gia) {
              datnhat = dt;
            }
        }
        datnhat.hienThi();
        System.out.println("\n=== BƯỚC 8: XÓA PHẦN TỬ (.remove) ===\n");
        DienThoai bixoa = danhsach.remove(1);
        System.out.println("🗑️ Đã xóa: " + bixoa.ten);

        System.out.println("Sau khi xóa: " + danhsach.size() + " phần tử\n");

        System.out.println("📱 Danh sách còn lại:");
        for (DienThoai dt : danhsach) {
            System.out.println("- " + dt.ten);
        }

        System.out.println("\n=== BƯỚC 9: KIỂM TRA (.isEmpty) ===\n");
        if(danhsach.isEmpty()) {
            System.out.println("Danh sách rỗng");
        }else{
            System.out.println("Danh sách có " + danhsach.size() + " phần tử");
        }
        System.out.println("\n=== BƯỚC 10: XÓA TẤT CẢ (.clear) ===\n");
        danhsach.clear();
        System.out.println("🗑️ Đã xóa tất cả!");
        System.out.println("Số phần tử: " + danhsach.size());

        if (danhsach.isEmpty()) {
            System.out.println("✅ Danh sách đã RỖNG!\n");
        }

    }
}