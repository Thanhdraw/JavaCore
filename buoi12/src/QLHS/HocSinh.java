package QLHS;

public abstract class HocSinh {
    private String name;
    private double math;
    private double lit;

    public HocSinh(String name, double math, double lit) {
        this.name = name;
        this.math = math;
        this.lit = lit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLit() {
        return lit;
    }

    public void setLit(double lit) {
        this.lit = lit;
    }

    abstract public double tinhDiemTrungBinh();

    abstract public String getRank();


    public void display() {
        System.out.println("Tên học sinh: " + this.name + " điêm Toán: " + this.math + " điểm Văn: " + this.lit);
    }


}
