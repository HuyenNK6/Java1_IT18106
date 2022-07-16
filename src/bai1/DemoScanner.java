/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoScanner {

    //psvm+TAB
    //Ctrl+Space
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ tên:"); //sout+TAB
        String hoTen = scanner.nextLine();//CTRL+Cách
        System.out.println("Xin chào" + hoTen);
        System.out.print("Nhập số a= ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b= ");
        int b = scanner.nextInt();
        System.out.print("Nhập số c= ");
        int c = scanner.nextInt();
        //delta= b^2-4ac
        double delta= Math.pow(b, 2)- 4*a*c;
        System.out.println("delta= "+ delta);
        //sout+TAB
        System.out.println("a= " + a);
        System.out.print("b= " + b);
        System.out.printf("c= %d", c);
        scanner.nextLine();
        System.out.print("Quê quán: ");
        String queQuan = scanner.next();// cho phép 1 dòng từ bàn phím
        System.out.println(queQuan);
    }
    public  static void add(){
        System.out.println("add");
    }
}
