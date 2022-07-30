/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author HuyenNK
 */
public class MainHinh {
    public static void main(String[] args) {
        /*
        Tính đa hình
        - Overrding thực hiện tính đa hình
        - 1 hành vi có thể được thực hiện với các hình thái khác nhau
        - Upcasting (ép kiểu đối tượng)
        Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng 
        của lớp con
        */
//        HinhTron h1= new HinhTron(2);
        Hinh h1= new HinhTron(2);
        h1.xuat();
        System.out.println(h1.tinhChuVi());
        System.out.println(h1.tinhDienTich());
        
//        HinhTamGiac h2= new HinhTamGiac(3, 4, 5);
        Hinh h2= new HinhTamGiac(3, 4, 5);
        h2.xuat();
        System.out.println(h2.tinhChuVi());
        System.out.println(h2.tinhDienTich());
    }
}
