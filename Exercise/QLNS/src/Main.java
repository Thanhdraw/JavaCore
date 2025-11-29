import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<NhanVien> danhSachNV = new ArrayList<>();
    static ArrayList<PhongBan> danhSachPB = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        danhSachPB.add(new PhongBan("IT", 1.5));
        danhSachPB.add(new PhongBan("Sales", 1.3));
        danhSachPB.add(new PhongBan("HR", 1.2));
        danhSachPB.add(new PhongBan("Marketing", 1.2));
        int choice;
        do {
            System.out.println("1.Thêm nhan viên mới");
            System.out.println("0.Thoát chương trinh");
            System.out.print("Chọn chương trình:");


            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    themNhanVienMoi();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    return;
            }

        } while (choice != 0);

    }

    public static void themNhanVienMoi() {

    }
}