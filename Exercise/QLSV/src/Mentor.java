import java.util.Scanner;

public class Mentor extends SinhVien {

    private double salary;

//    public Mentor(String name, int age, String gender, double salary) {
//        super(name, age, gender);
//        this.salary = salary;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Lương: ");
        this.salary = sc.nextDouble();
    }
}
