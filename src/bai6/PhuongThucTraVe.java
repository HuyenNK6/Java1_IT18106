/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author HuyenNK
 */
public class PhuongThucTraVe {

    /*
    - Tên lớp đối tượng
    - Tên package
    - Tên biến
    - Tên arrayList
    - Tên phương thức
     */
    public static void main(String[] args) {
        //getThue(): double
        // getThue(): void
        tinhTong(2, 8);
        
        PhuongThucTraVe pttv= new PhuongThucTraVe();
        pttv.tinhTong(2, 4, 5);
    }

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public int tinhTong(int a, int b, int c) {
        return a + b + c;
    }
}
