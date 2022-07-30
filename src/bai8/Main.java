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
public class Main {
    public static void main(String[] args) {
        SinhVien sv1= new SinhVien();
        sv1.setMsv("PH123");
        sv1.setMailFpt("mail@fpt");
        
        sv1.setHoTen("huyen");
        sv1.setTuoi(18);
        sv1.setDiaChi("HN");
        sv1.setSdt("0985");
        sv1.setCccd("037");
        
        SinhVien sv2= new SinhVien("PH456", "mail2@fpt.edu", "Le Viet H oang",
                                    20, "HN", "0123", "1452");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        
        Nguoi n= new Nguoi();
        n.xuat();//gọi phương thức xuat() của lớp cha- Người
        sv1.xuat();//gọi phương thức xuat() của lớp con- Sinh Vien
    }
}
