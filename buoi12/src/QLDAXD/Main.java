package QLDAXD;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DuAn> list = new ArrayList<DuAn>();
        list.add(new DuAnCongTrinh("Cầu B",5000000));
        list.add(new DuAnNhaDan("Nhà phố A",1000000));
        for (DuAn duAn : list) {
            System.out.println(duAn.toString());
        }
    }
}
