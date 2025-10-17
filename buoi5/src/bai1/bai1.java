package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap số nguyên x: ");
        int x = sc.nextInt();
        if(x>0){
            System.out.print("Số dương");
        }else{
            System.out.print("Số âm hoặc bằng 0");
        }

    }
}
