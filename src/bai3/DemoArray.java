/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Arrays;

/**
 *
 * @author HuyenNK
 */
public class DemoArray {

    public static void main(String[] args) {
        //Array: Mảng: là tập hợp các 
        //giá trị có cùng kiểu dữ liệu
        String danhSach[] = {"A", "B", "C", "D"};
        System.out.println("Độ dài mảng là: " + danhSach.length);
        System.out.println("danhSach[1]= " + danhSach[1]);
        System.out.println("Cách 1");
        for (int i = 0; i < danhSach.length; i++) {
            System.out.printf("danhSach[%d]= %s", i, danhSach[i]);
            System.out.println("");
        }
        System.out.println("Cách 2");
        //for- each
        for (String x : danhSach) {
            System.out.println(x);
        }
        System.out.println("Cách 3");
        System.out.println("Danh Sách: " + Arrays.toString(danhSach));

        int arr[] = {5, 8, 7, 4, 9, 6, 3, 1, 2};
        System.out.println("Mảng số: " + Arrays.toString(arr));
        int viTri= Arrays.binarySearch(arr, 4);
        System.out.println("Vị trí số 4= "+viTri);
        
        Arrays.sort(arr);
        System.out.println("Sau sắp xếp tăng dần: " + Arrays.toString(arr));
        //phải sắp xếp (sort) trước khi dùng thuật toán tìm kiếm binarySearch
        int viTri2= Arrays.binarySearch(arr, 4);
        System.out.println("Vị trí số 4= "+viTri2);

    }
}
