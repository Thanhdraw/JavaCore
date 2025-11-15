import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TruongHoc cybersoft = new TruongHoc("Cybersoft", "MST111", 200000000);


        int menu = 0;
        do {
            System.out.println("Vui lòng chọn đối tượng muốn nhập: ");
            System.out.println("1.Sinh viên");
            System.out.println("2.Mentor");
            System.out.println("3.Giảng viên");
            System.out.println("0.Thoát");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    SinhVien sinhVien = new SinhVien();
                    sinhVien.nhap();
                    cybersoft.getSinhVienList().add(sinhVien);
                    break;
                case 2:
                    Mentor mentor = new Mentor();
                    mentor.nhap();
                    cybersoft.getSinhVienList().add(mentor);
                    break;

                case 3:
                    GiangVien giangVien = new GiangVien();
                    giangVien.nhap();
                    cybersoft.getSinhVienList().add(giangVien);
                    break;
                default:
                    System.out.println("Không có trong menu");
                    break;
            }
        } while (menu != 0);
//        for(SinhVien sv : cybersoft.getSinhVienList()) {
//            System.out.println(sv.getName());
//        }
        GiangVien giangVien = new GiangVien();
        for (int i = 0; i < cybersoft.getSinhVienList().size(); i++) {
            SinhVien item = cybersoft.getSinhVienList().get(i);
            if(item instanceof GiangVien){
                System.out.println("Danh sách giảng viên " + i + ")" + item.getName());
            }

        }
        System.out.println("Vui long chọn con số của giảng viên muốn gán sinh viên ");
        Scanner scannerChonGV = new Scanner(System.in);
        int vitrichon =  scannerChonGV.nextInt();
        giangVien = (GiangVien) cybersoft.getSinhVienList().get(vitrichon);

        SinhVien sinhvienDuocChon = new SinhVien();
        for (int i = 0; i < cybersoft.getSinhVienList().size(); i++) {
            SinhVien item = cybersoft.getSinhVienList().get(i);
            if(!(item instanceof GiangVien) && (item instanceof SinhVien)){
                System.out.println("Danh sách sinh viên " + i + item.getName());
            }
        }

        System.out.println("Vui lòng chọn con số của sinh viên muốn gán sinh viên");
        Scanner scannerSinhVien = new Scanner(System.in);
        int vitriSVchon =  scannerSinhVien.nextInt();
        sinhvienDuocChon = cybersoft.getSinhVienList().get(vitriSVchon);
        giangVien.getSinhVienList().add(sinhvienDuocChon);

    }

}