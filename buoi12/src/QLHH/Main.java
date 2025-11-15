package QLHH;

public class Main {
    public static void main(String[] args) {
        HinhHoc[] hinhHoc = {
                new HinhChuNhat(7.5, 6.5),
                new HinhTron(8)
        };
        for (HinhHoc h : hinhHoc) {
            System.out.println("Dien tich la: " + h.tinhDienTich());
            System.out.println("Chu vi la: " + h.tinhChuvi());
        }
    }
}
