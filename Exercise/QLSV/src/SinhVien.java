import java.util.Scanner;

public class SinhVien {
    private String name;
    private String gender;
    private int age;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tên sinh viên: ");
        this.name = sc.nextLine();

        System.out.print("Nhap gender: ");
        this.gender = sc.nextLine();

        System.out.print("Nhap age: ");
        this.age = sc.nextInt();
    }

//    public SinhVien(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
