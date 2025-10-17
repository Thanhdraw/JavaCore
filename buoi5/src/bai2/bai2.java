package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap số tuổi: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("Đủ tuổi đi bầu");
        }else{
            System.out.print("Chưa đủ tuổi");
        }

    }
}
