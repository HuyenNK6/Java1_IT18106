/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoDoWhile {

    //psvm+TAB
    public static void main(String[] args) {
        //while-- kiểm tra điều kiện trước
        //- sau mới thực hiện công việc
        //do-while-- thực hiện ít nhất 1 lần, 
        //điều kiện kiệm tra sau

        //bảng cửu chương
        int m = 8, n = 1;
        while (n <= 10) {
            System.out.printf(" %d x %d = %d", m, n, m * n);
            System.out.println("");
            n++;
        }
        //while(true)
        // điểm thỏa mãn trong khoảng 0-10
        Scanner sc = new Scanner(System.in);
        double diem;
        while (true) {
            System.out.print("Nhập điểm= ");
            diem = sc.nextDouble();
            if (diem >= 0 && diem <= 10) {//diem [0;10]
                System.out.println("Điểm của bạn là= " + diem);
                break;
            }
            System.out.println("Điểm phải nằm trong khoảng 0-10");
        }
        //do-while
        //tuổi trong khoảng 18-40
        int tuoi=20;
        //do+Ctrl+Cách
        do {
            System.out.print("Nhập tuổi= ");
            tuoi = sc.nextInt();
        } while (tuoi < 18 || tuoi >40); 
        System.out.println("Tuổi của bạn là: "+ tuoi);
        //nếu tuổi <18 hoặc tuổi >40 => nhập lại tuổi
    }
}
