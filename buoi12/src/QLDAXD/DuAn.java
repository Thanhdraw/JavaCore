package QLDAXD;

public abstract class DuAn {
    private String tenDuAn;
    private double chiPhiCoBan;

    public DuAn(String tenDuAn, double chiPhiCoBan) {
        this.tenDuAn = tenDuAn;
        this.chiPhiCoBan = chiPhiCoBan;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public double getChiPhiCoBan() {
        return chiPhiCoBan;
    }


    public abstract double tinhTongChiPhi();

    @Override
    public String toString() {
        return "Dự án: " + tenDuAn + ", chi phí cơ bản: " + chiPhiCoBan;
    }
}
