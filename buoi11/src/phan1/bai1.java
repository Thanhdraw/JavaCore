package phan1;

import java.util.Scanner;

public class bai1 {

    int studentId;
    String studentName;
    double mathScore;
    double physicsScore;
    double chemistryScore;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        studentName = sc.nextLine();
        System.out.println("Ma sinh vien: ");
        studentId = (int) (Math.random() * 101);
        System.out.println("Nhap điểm toán: ");
        mathScore = sc.nextDouble();
        System.out.println("Nhap điểm Lý: ");
        physicsScore = sc.nextDouble();
        System.out.println("Nhap điểm Hóa: ");
        chemistryScore = sc.nextDouble();
    }

    public double calculateAverage() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }

    public String getGrade() {
        double avg = calculateAverage();
        if (avg >= 9)
            return "Excellent";
        else if (avg >= 8)
            return "Good";
        else if (avg >= 7)
            return "Fair";
        else if (avg >= 6)
            return "Average";
        else if (avg >= 5)
            return "Below Average";
        else
            return "Poor";
    }
    public void displayInfo() {
        System.out.println("\n===== Student Information =====");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + studentName);
        System.out.println("Math: " + mathScore);
        System.out.println("Physics: " + physicsScore);
        System.out.println("Chemistry: " + chemistryScore);
        System.out.printf("Average Score: %.2f\n", calculateAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        bai1 student = new  bai1();
        student.inputData();
        student.displayInfo();

    }
}
