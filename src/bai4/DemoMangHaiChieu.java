/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoMangHaiChieu {

    public static void main(String[] args) {
        //<kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu> [row][col]
        // row: số hàng
        // col: số cột

        //1. Khởi tạo
        //Mảng 2 chiều gồm 2 hàng và 3 cột
        int[][] arr = new int[2][3];
        //2. Gán giá trị
        //hàng 1
        arr[0][0] = 5;
        arr[0][1] = 7;
        arr[0][2] = 9;
        //hàng 2
        arr[1][0] = 2;
        arr[1][1] = 4;
        arr[1][2] = 6;
        //3. Truy xuất dữ liệu
        System.out.println("arr[0][1]= " + arr[0][1]);
        //for+ctrl+cach
        for (int i = 0; i < 2; i++) {
            //2: số hàng - i: vị trí của hàng
            for (int j = 0; j < 3; j++) {
                //3: số cột - j: vị trí của cột
                System.out.printf("hàng %d | cột %d = ", i, j);
                System.out.println(arr[i][j]);//hàng i cột j
            }
        }
        //in ma trận
        for (int i = 0; i < 2; i++) {
            //2: số hàng - i: vị trí của hàng
            for (int j = 0; j < 3; j++) {
                //3: số cột - j: vị trí của cột
                System.out.print(arr[i][j] + "\t");//hàng i cột j
            }
            System.out.println("");
        }
        //ĐB:cho ng dùng tự tạo mảng 2 chiều
        //với số hàng số cột và giá trị 
        //nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        // khởi tạo
        int[][] arrNumber = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập hàng %d | cột %d = ", i, j);
                arrNumber[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Giá trị hàng %d | cột %d = %d"
                        , i, j,arrNumber[i][j]);
                
            }
        }
    }
}
