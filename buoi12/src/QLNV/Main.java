package QLNV;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanViens = {
                new NhanVienFullTime("thanh", 24, 2000, 2.4),
                new NhanVienPartTime("thanh", 24, 4, 100),
        };
        double tongLuong = 0;
        for (NhanVien nhanVien : nhanViens) {
            tongLuong += nhanVien.tinhLuong();
            nhanVien.displayInfo();
        }
        System.out.println("Tong Luong: " + tongLuong);
    }
}
