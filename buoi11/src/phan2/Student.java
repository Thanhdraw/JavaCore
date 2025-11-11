package phan2;

public class Student {
    private String studentId;
    private String fullName;
    private double mathScore;

    private double physicsScore;
    private double chemistryScore;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public Student(String studentId, String fullName, double mathScore, double physicsScore, double chemistryScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public double getAverage() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 9)
            return "Xuất sắc";
        else if (avg >= 8)
            return "Giỏi";
        else if (avg >= 7)
            return "Khá";
        else if (avg >= 6)
            return "Trung bình";
        else if (avg >= 5)
            return "Trung bình yếu";
        else
            return "Yếu";
    }

    public void display() {
        System.out.printf("%-10s %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-15s\n",
                studentId, fullName, mathScore, physicsScore, chemistryScore, getAverage(), getGrade());
    }



}
