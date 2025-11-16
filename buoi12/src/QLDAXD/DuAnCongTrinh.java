package QLDAXD;

public class DuAnCongTrinh extends DuAn {

    public DuAnCongTrinh(String tenDuAn, double chiPhiCoBan) {
        super(tenDuAn, chiPhiCoBan);
    }

    @Override
    public double tinhTongChiPhi() {
        return getChiPhiCoBan() * 1.15;
    }

    @Override
    public String toString() {
        return "Dự án công trình: " + getTenDuAn() + ", tổng chi phí: " + tinhTongChiPhi();
    }


}
