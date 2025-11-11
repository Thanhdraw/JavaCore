package phan3;

public class TroChoi {
    private String tenTroChoi;
    private int soLuotChoi;


    public TroChoi(String tenTroChoi) {
        this.tenTroChoi = tenTroChoi;
        this.soLuotChoi = 0;
    }


    public void batDau() {
        System.out.println("Bắt đầu trò chơi: " + tenTroChoi);
        soLuotChoi++;
    }


    public void ketThuc() {
        System.out.println("Kết thúc trò chơi: " + tenTroChoi);
        System.out.println("Số lượt chơi hiện tại: " + soLuotChoi);
    }
}
