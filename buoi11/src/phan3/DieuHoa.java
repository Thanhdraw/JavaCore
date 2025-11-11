package phan3;

public class DieuHoa extends ThietBiDien {
    private String chucNang;
    private int nhietDo;

    public DieuHoa(String tenThietBi, double congSuat, String nhaSanXuat,
                   String chucNang, int nhietDo) {
        super(tenThietBi, congSuat, nhaSanXuat);
        this.chucNang = chucNang;
        this.nhietDo = nhietDo;
    }


    public void bat() {
        System.out.println(tenThietBi + " đang bật với chức năng " + chucNang + " ở " + nhietDo + "°C");
    }


    public void tat() {
        System.out.println(tenThietBi + " đã tắt.");
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chức năng: " + chucNang);
        System.out.println("Nhiệt độ cài đặt: " + nhietDo + "°C");
    }
}
