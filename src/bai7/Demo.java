/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class Demo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        nhapSo();
        nhapHoTen();
    }
    //nhập Số => kiểm tra số
    static void nhapSo() {
        String input;
        do {
            System.out.print("Nhập số: ");
            input = sc.nextLine();
        } while (!checkSo(input));
    }
    static boolean checkSo(String input){
        String value= input.trim();
        String regex= "\\d+";//[0-9]+ ký tự số sẽ xuất hiện 1- Nhiều lần
        return value.matches(regex);
    }
     //nhập Họ tên => kiểm tra chữ
    static void nhapHoTen() {
        String input;
        do {
            System.out.print("Nhập họ tên: ");
            input = sc.nextLine();
            String []ten= input.split("\\s");//tách theo khoảng trắng
            for (String s : ten) {
                System.out.print(vietHoaChuCaiDau(s)+" ");
            }
            System.out.println("");
        } while (!checkHoTen(input));
    }
    static boolean checkHoTen(String input){
        String value= input.trim();
        String regex= "[a-zA-Z ]+";// ký tự chữ sẽ xuất hiện 1- Nhiều lần
        return value.matches(regex);
    }
    static String vietHoaChuCaiDau(String input){
        String value= input.trim();
        String str= String.valueOf(value.charAt(0)).toUpperCase()
                + value.substring(1).toLowerCase(); 
// chuyển từ char về String
// trả về chuỗi con từ vị trí 1 đến hết
        return str;
    }
}
