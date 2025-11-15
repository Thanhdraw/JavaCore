import java.util.ArrayList;
import java.util.List;

public class GiangVien extends Mentor {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public List<SinhVien> getSinhVienList() {
        return sinhVienList;
    }

    public void setSinhVienList(List<SinhVien> sinhVienList) {
        this.sinhVienList = sinhVienList;
    }


//    public GiangVien(String name, int age, String gender, double salary) {
//        super(name, age, gender, salary);
//    }
}
