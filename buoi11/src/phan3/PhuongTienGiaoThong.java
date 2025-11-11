package phan3;

public class PhuongTienGiaoThong {
    private String color;

    public PhuongTienGiaoThong(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Màu sắc của xe là: " + this.color);
    }
}
