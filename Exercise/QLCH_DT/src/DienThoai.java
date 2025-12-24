public class DienThoai {
    String ten;
    double gia;
    int soLuong;
    public DienThoai(String ten, double gia, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public void hienThi(){
        System.out.println("Tên: " + ten);
        System.out.println("Giá: " + (long) gia + "đ");
        System.out.println("Số lượng: " + soLuong);
        System.out.println("--------------------");
    }
}

