package QLDAXD;

public class DuAnNhaDan extends DuAn {
    public DuAnNhaDan(String tenDuAn, double chiPhiCoBan) {
        super(tenDuAn, chiPhiCoBan);
    }

    @Override
    public double tinhTongChiPhi() {
        // Chi phí vật liệu = 20% chi phí cơ bản
        return getChiPhiCoBan() * 1.2;
    }

    @Override
    public String toString() {
        return "Dự án nhà dân: " + getTenDuAn() + ", tổng chi phí: " + tinhTongChiPhi();
    }
}
