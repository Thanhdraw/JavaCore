package QLHS;

public class Main {
    public static void main(String[] args) {
        HocSinh[] hocsinh = {
                new HocSinhCap1("Bin",9,8.5),
                new HocSinhCap3("Thành",9,10)
        };
        for (HocSinh h : hocsinh) {
            h.display();
        }
    }
}
