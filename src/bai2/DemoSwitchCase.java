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
public class DemoSwitchCase {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("-----------MENU------------");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Kết thúc");
        System.out.println("---------------------------");
        System.out.println("Chọn chức năng? ");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        System.out.println("Chức năng " + chon);
//        if (chon == 1){
//            phepCong();
//        }else if (chon == 2 ){
//            phepTru();
//        }else {
//            System.exit(0);
//        }
// CTRL + /
        switch (chon) {
            case 1:
                phepCong();
            case 2:
                phepTru();
                break;
            default:
                System.exit(0);
        }
    }

    public static void phepCong() {
        System.out.println("Đây là phép cộng");
    }

    public static void phepTru() {
        System.out.println("Đây là phép trừ");
    }
}
