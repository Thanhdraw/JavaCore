package phan3;

public class Main {
    public static void main(String[] args) {
        // 1) Học sinh
        HocSinh hs1 = new HocSinh("Nguyen Van An", 16, 9, 8.5, 7.5);
        hs1.hienThiThongTin();
        System.out.println();

        // 2) Xe hơi
        XeHoi xe1 = new XeHoi("Toyota", 2020, "Đỏ");
        xe1.displayInfo();
        System.out.println();

        // 3) Trò chơi
        TroChoi game = new TroChoi("Đua xe");
        game.batDau();
        game.ketThuc();

        //4.Thiết bị điện
        DieuHoa dh1 = new DieuHoa("Điều hòa LG", 1200, "LG", "Làm lạnh", 24);
        MaySay ms1 = new MaySay("Máy sấy Panasonic", 800, "Panasonic", 3, "Nhiệt");
        System.out.println("=== THIẾT BỊ ĐIỀU HÒA ===");
        dh1.hienThiThongTin();
        dh1.bat();
        dh1.tat();

        System.out.println("\n=== THIẾT BỊ MÁY SẤY ===");
        ms1.hienThiThongTin();
        ms1.bat();
        ms1.tat();
    }
}
