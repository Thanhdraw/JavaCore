package phan3;

public class MaySay extends ThietBiDien {
    private int tocDo;
    private String cheDo;

    public MaySay(String tenThietBi, double congSuat, String nhaSanXuat,
                  int tocDo, String cheDo) {
        super(tenThietBi, congSuat, nhaSanXuat);
        this.tocDo = tocDo;
        this.cheDo = cheDo;
    }

    // Bật máy sấy
    public void bat() {
        System.out.println(tenThietBi + " đang bật với chế độ " + cheDo + " và tốc độ " + tocDo);
    }

    // Tắt máy sấy
    public void tat() {
        System.out.println(tenThietBi + " đã tắt.");
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chế độ: " + cheDo);
        System.out.println("Tốc độ: " + tocDo);
    }
}
