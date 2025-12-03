package QLNS;

public abstract class NhanSu {
    protected String maSo;
    protected String hoTen;
    protected String soDienThoai;
    protected int soNgayLamViec;

    public NhanSu(String maSo, String hoTen, String soDienThoai, int soNgayLamViec) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
    }
    public abstract double tinhLuong();
    public abstract void xuatThongTin();

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }
}
