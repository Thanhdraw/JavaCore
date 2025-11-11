package phan3;
public class HocSinh {
    private String ten;
    private int tuoi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;


    public HocSinh(String ten, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }


    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }


    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
        System.out.printf("Điểm trung bình: %.2f\n", tinhDiemTrungBinh());
    }
}

