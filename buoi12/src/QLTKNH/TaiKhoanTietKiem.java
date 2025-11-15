package QLTKNH;

public class TaiKhoanTietKiem extends TaiKhoan {
    private static final double SO_TIEN_TOI_THIEU = 100000;
    private double laixuat;

    public TaiKhoanTietKiem(int stk, double sodu, double laixuat) {
        super(stk, sodu);
        this.laixuat = laixuat;
    }

    public double getLaixuat() {
        return laixuat;
    }

    public void setLaixuat(double laixuat) {
        this.laixuat = laixuat;
    }

    @Override
    public double rutTien(double soTien) {
        double newBalance = getSodu() - soTien;
        if (soTien > 0 && newBalance >= SO_TIEN_TOI_THIEU) {
            setSodu(newBalance);
            return newBalance;
        }
        return -1;
    }

    public void tinhLai() {
        double tienLai = getSodu() * laixuat;
        setSodu(getSodu() + tienLai);
    }

}
