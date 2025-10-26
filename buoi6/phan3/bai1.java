package buoi6.phan3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nguoiThang = 0, mayThang = 0, hoa = 0;
        int tiepTuc = 1;

        System.out.println("=== Trò chơi Oẳn Tù Tì ===");
        System.out.println("1. Búa (Rock)");
        System.out.println("2. Kéo (Scissors)");
        System.out.println("3. Bao (Paper)");
        System.out.println("Nhấn số tương ứng để chọn.");

        do {
            System.out.print("\nChọn (1-Búa, 2-Kéo, 3-Bao): ");
            int nguoi = sc.nextInt();

            if (nguoi < 1 || nguoi > 3) {
                System.out.println("❌ Lựa chọn không hợp lệ!");
                continue;
            }

            int may = (int) (Math.random() * 3) + 1; // 1–3
            System.out.println("Máy chọn: " + chuyenThanhTen(may));

            if (nguoi == may) {
                System.out.println("👉 Hòa!");
                hoa++;
            } else if ((nguoi == 1 && may == 2) || (nguoi == 2 && may == 3)
                    || (nguoi == 3 && may == 1)) {
                System.out.println("🎉 Bạn thắng!");
                nguoiThang++;
            } else {
                System.out.println("💻 Máy thắng!");
                mayThang++;
            }

            System.out.print("\nNhấn 0 để dừng, hoặc số khác 0 để chơi tiếp: ");
            tiepTuc = sc.nextInt();

        } while (tiepTuc != 0);

        System.out.println("\n=== KẾT QUẢ CUỐI CÙNG ===");
        System.out.println("Bạn thắng: " + nguoiThang + " lần");
        System.out.println("Máy thắng: " + mayThang + " lần");
        System.out.println("Hòa: " + hoa + " lần");

        if (nguoiThang > mayThang)
            System.out.println("🎯 Bạn là người chiến thắng chung cuộc!");
        else if (mayThang > nguoiThang)
            System.out.println("🤖 Máy thắng chung cuộc!");
        else
            System.out.println("🤝 Hai bên hòa nhau!");

        sc.close();
    }

    // Hàm đổi số thành tên
    static String chuyenThanhTen(int n) {
        switch (n) {
            case 1:
                return "Búa";
            case 2:
                return "Kéo";
            case 3:
                return "Bao";
            default:
                return "";
        }
    }
}
