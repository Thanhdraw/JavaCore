package QLTKNH;

public abstract class TaiKhoan {
    private int stk;
    private double sodu;


    public TaiKhoan(int stk, double sodu) {
        this.stk = stk;
        this.sodu = sodu;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    public boolean kiemTaRutTien(double soTien) {
        if (soTien < this.sodu && soTien > 0)
            return true;
        else
            return false;
    }

    public abstract double rutTien(double soTien);

}
