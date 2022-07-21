/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.ArrayList;

/**
 *
 * @author HuyenNK
 */
public class Main {
    public static void main(String[] args) {
        //sử dụng Constructor có tham số
        SinhVien sv1= new SinhVien("PH123456", "Khanh Huyen", 
                                                "huyen@fpt.edu.vn", "Ha Noi", 
                                                18, 10);
        SinhVien sv2 = new SinhVien("PH52416", "Doan Van Duc");
        //sử dụng Constructor không tham số
        SinhVien sv3= new SinhVien();
        sv3.setMsv("PH548726");
        sv3.setHoTen("Tuan Anh");
        sv3.setEmail("anh@fpt.edu.vn");
        sv3.setDiaChi("Ha Noi");
        sv3.setTuoi(20);
        sv3.setDiem(9);
        
        System.out.println(sv3.getHoTen());
        
        System.out.println(sv1);
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        //constructor ko tham số
        SinhVien sv4= new SinhVien();
        sv4.nhap();
        sv4.xuat();
        //arraylist chứa tất cả các đối tượng Sinh Viên
        ArrayList<SinhVien> listSinhVien= new ArrayList<>();
        listSinhVien.add(sv1);//thêm sinh viên vào arraylist
        listSinhVien.add(sv2);
        //fore + ctrl+ cách 
        for (SinhVien sv : listSinhVien) {
//            sv.xuat();
            System.out.println(sv.toString());
        }
    }
}
