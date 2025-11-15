package QLTKNH;

public class TaiKhoanThanhToan extends TaiKhoan {

    private static final double PHI_RUT = 10000;

    public TaiKhoanThanhToan(int stk, double sodu) {
        super(stk, sodu);
    }

    @Override
    public double rutTien(double soTien) {
        double newBalance = soTien + PHI_RUT;
        if (newBalance > 0 && newBalance <= getSodu()) {
            setSodu(getSodu() - newBalance);
            return getSodu();
        }else {
            return -1;
        }
    }
}
