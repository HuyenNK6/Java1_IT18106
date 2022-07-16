/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoIfElse {

    //psvm+TAB
    public static void main(String[] args) {
        /*
        if (điều kiện) {
            <khối lệnh 1>
        }else{
            <khối lệnh 2>
        }
         */

        int a = 12;
        int b = 78;
        // (điều kiện) ? giá trị đúng :  giá trị sai
        int min = a > b ? b : a;
        System.out.println("min= " + min);
        boolean test = !(a < b);
        System.out.println("test= " + test);

        //Nhập số dương từ bàn phím. tính và xuất ra căn bậc 2
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số dương: "); //sout+TAB hoặc CTRL+ Cách
            int so = scanner.nextInt();
            if (so > 0) {
                System.out.println("Đây là số dương");
                double ketQua = Math.sqrt(so);
                System.out.println("Căn bậc 2 của số " + so + " là " + ketQua);
                System.out.printf("Căn bậc 2 của số %d là %.3f",so , ketQua);
                System.out.println();
            } else {
                System.out.println("Không phải số dương");
            }
        } catch (Exception ex) {
            System.out.println("Phải nhập vào 1 số");
        }
    }
}
