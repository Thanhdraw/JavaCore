package QLTKNH;

public class Main {
    public static void main(String[] args) {
        TaiKhoan[] taiKhoan = {
                new TaiKhoanThanhToan(456, 500000),
                new TaiKhoanTietKiem(123, 1000000, 0.05)
        };
        for (TaiKhoan tk : taiKhoan) {
            double sotienrut = 200000;
            double ketqua = tk.rutTien(sotienrut);

            if (ketqua != -1) {
                if (tk instanceof TaiKhoanTietKiem) {
                    ((TaiKhoanTietKiem) tk).tinhLai();
                }
                System.out.println("Rút " + sotienrut + " thành công, số dư mới là: " + tk.getSodu());
            } else {
                System.out.println("Rút " + sotienrut + " thất bại");
            }
        }
    }
}
