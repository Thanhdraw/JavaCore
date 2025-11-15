import java.util.ArrayList;
import java.util.List;

public class TruongHoc {
    private String nameSchool;
    private String taxCode;
    private double monthlyRevenue;

    private List<SinhVien> sinhVienList = new ArrayList<SinhVien>();

    public List<SinhVien> getSinhVienList() {
        return sinhVienList;
    }

    public void setSinhVienList(List<SinhVien> sinhVienList) {
        this.sinhVienList = sinhVienList;
    }
    public TruongHoc(String nameSchool, String taxCode, double monthlyRevenue) {
        this.nameSchool = nameSchool;
        this.taxCode = taxCode;
        this.monthlyRevenue = monthlyRevenue;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    public void display() {
        System.out.println("Name: " + nameSchool);
        System.out.println("Tax Code: " + taxCode);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
    }


}
