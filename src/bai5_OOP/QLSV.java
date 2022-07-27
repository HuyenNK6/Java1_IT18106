/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class QLSV {

    static ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhapDanhSach();
        xuatDanhSach();
        getSinhVien();
        timKiem();
        sua();
        xoa();
        sapXep();
        xuatDanhSach();

    }

    public static void getSinhVien() {
        for (int i = 0; i < listSinhVien.size(); i++) {
            SinhVien sv = listSinhVien.get(i);
            //lấy ra đối tượng là sinh viên tại vị trí i
            System.out.println("Sinh Viên tại vị trí i= " + i);
            System.out.println(sv.toString());
        }
    }

    public static void nhapDanhSach() {
        //nhập danh sách
        String yesNo;
        do {
            SinhVien sv = new SinhVien(); //khởi tạo 1 đối tượng SV mới
            sv.nhap();// gán giá trị
            listSinhVien.add(sv);//thêm vào danh sách
            System.out.print("Mày có muốn tiếp tục ko? (Y/N)");
            yesNo = sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
        //equalsIgnoreCase: 
        //so sánh String ko phân biệt chữ hoa vs chữ thường
    }

    public static void xuatDanhSach() {
        for (SinhVien sv : listSinhVien) {
            sv.xuat();
        }
    }

    public static void timKiem() {
        // tìm kiếm sinh viên theo họ tên
        System.out.print("Nhập tên cần tìm: ");
        String hoTen = sc.nextLine();
        for (SinhVien sv : listSinhVien) {
            if (sv.getHoTen().equalsIgnoreCase(hoTen)) {
                //nếu họ tên của sv bằng hoTen nhập vào
                // thì xuất ra thông tin sv
                sv.xuat();
            }
        }
    }

    public static void sua() {//sửa
        // tìm kiếm sinh viên theo mã sinh viên
        //sửa tuổi
        System.out.print("Nhập msv cần sửa: ");
        String msv = sc.nextLine();
        for (SinhVien sv : listSinhVien) {
            if (sv.getMsv().equalsIgnoreCase(msv)) {
                //nếu msv của sv bằng msv nhập vào
                // thì sửa tuổi của sv
                System.out.println("Nhập tuổi mới: ");
                int tuoiMoi = sc.nextInt();
                sc.nextLine();
                sv.setTuoi(tuoiMoi);// sửa tuổi = Setter
                sv.xuat();
            }
        }
    }

    public static void xoa() {//xóa
        // tìm kiếm sinh viên theo mã sinh viên
        //xóa nó
        System.out.print("Nhập msv cần xóa: ");
        String msv = sc.nextLine();
        for (SinhVien sv : listSinhVien) {
            if (sv.getMsv().equalsIgnoreCase(msv)) {
                //nếu msv của sv bằng msv nhập vào
                // thì XÓA sv đó
                listSinhVien.remove(sv);// xóa sv khỏi list
                break;
            }
        }
    }

    public static void sapXep() {
//          Collections.sort(listSinhVien);
        //Wrapper:  Integer, Double, Float,..
        //String

        /*tao Comparator 
        Interface Comparator trong java được sử dụng 
        để sắp xếp các đối tượng của lớp do người dùng định nghĩa
         */
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
                //Wrapper:  Integer, Double, Float,..
                //String
                // so sánh họ tên của đối tượng SInh viên o1
                // với họ tên của đối tượng SInh viên o2
                /*
                  =0: o1=o2
                  >0: o1>o2
                  <0: o1<o2
                 */
//                  return o1.getTuoi() > o2.getTuoi() ? 1: -1;
                // kiểu nguyên thủy: int, double,..
            }
        };
        //sắp xếp tăng dần
        
        
        Collections.sort(listSinhVien, comp);
    }
}
