package phan3;

public class ThietBiDien {
    protected String tenThietBi;
    protected double congSuat; // đơn vị: W
    protected String nhaSanXuat;


    public ThietBiDien(String tenThietBi, double congSuat, String nhaSanXuat) {
        this.tenThietBi = tenThietBi;
        this.congSuat = congSuat;
        this.nhaSanXuat = nhaSanXuat;
    }

    public void hienThiThongTin() {
        System.out.println("Tên thiết bị: " + tenThietBi);
        System.out.println("Công suất: " + congSuat + " W");
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
    }
}
