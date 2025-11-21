public abstract class ConNguoi {
    protected int tuoi;
    protected String ten;
    protected String gioitinh;

    public ConNguoi(int tuoi, String ten, String gioitinh) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.gioitinh = gioitinh;
    }

    public String toString() {
        return "Tên:" + ten + " - Tuổi: " + tuoi +
                " - Giới tính: " + gioitinh;
    }
}
