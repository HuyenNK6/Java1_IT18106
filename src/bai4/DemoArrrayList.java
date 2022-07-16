/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HuyenNK
 */
public class DemoArrrayList {

    /*
    ArrayList: mảng động để lưu trữ các phần tử
    - ArrayList được tạo ra vs kích cỡ ban đầu:
        +Khi thêm, kích cỡ này bị vượt => collection tự động tăng
        +KHi xóa, kích cỡ n bị giảm
     */
    public static void main(String[] args) {
        //ArrayList: Có định kiểu- Không định kiểu
        //1. Khởi tạo
        //ArrayList không định kiểu
        ArrayList arrListKDK = new ArrayList();
        //2. Gán giá trị
        //sử dụng phương thức add()
        arrListKDK.add("FPT");//String
        arrListKDK.add(1);//Integer
        arrListKDK.add(true);//Boolean

        //ArrayList có định kiểu 
        //Kiểu dữ liệu chỉ định trước: Integer
        //không dc sử dụng kiểu nguyên thủy: int, double, float,...
        //sử dụng lớp dữ liệu (wrapper lớp bao): Integer, Double, Float,...
        ArrayList<Integer> arrListCDKInt = new ArrayList<>();
        arrListCDKInt.add(9);
        arrListCDKInt.add(5);
        arrListCDKInt.add(0);

        //3. Truy xuất dữ liệu
        //sử dụng phương thức get (index) => lấy ra phần tử tại vị trí index
        System.out.println(arrListKDK.get(2));
        System.out.println("Kích cỡ của arrayList size= " + arrListKDK.size());
        for (int i = 0; i < arrListKDK.size(); i++) {
            System.out.println(arrListKDK.get(i));
        }
        arrListCDKInt.add(0, 3); //chèn 1 phần tử vào vị trí index
        //for-each: fore+ctrl+cach
        for (Integer numInt : arrListCDKInt) {
            System.out.println(numInt);
        }
        //4. Sắp xếp
        //3 9 5 0
        Collections.sort(arrListCDKInt);//sắp xếp tăng dần
        Collections.reverse(arrListCDKInt);//đảo ngược lại arrayList
        System.out.println("Sau sắp xếp");
        for (Integer numInt : arrListCDKInt) {
            System.out.println(numInt);
        }
        
    }
}
