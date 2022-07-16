/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author HuyenNK
 */
public class DemoFor {

    //psvm+TAB
    public static void main(String[] args) {
        //for (khởi tạo; điều kiện; bước nhảy)
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);
            if (i == 6) {
                break;// ngắt vòng lặp
            }
        }
        System.out.println("Continue");
        int tong = 0;
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;//thực hiện luôn vòng lặp tiếp theo
            }
            System.out.println("i= "+i);
            tong+=i;           
        }
        System.out.println("Tổng là: "+tong);
    }
}
