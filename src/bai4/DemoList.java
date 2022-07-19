/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HuyenNK
 */
public class DemoList {
    /*
    List là 1 Interface trong Java, kế thừa Collection 
    cung cấp các phương thức để thao tác vs phần từ
    */
    public static void main(String[] args) {
        //List: Có định kiểu- Không định kiểu
        //1. Khởi tạo
        //ArrayList không định kiểu
        List listKDK = new ArrayList();//Ctrl+R=> đổi tên
        //2. Gán giá trị
        //sử dụng phương thức add()
        listKDK.add("FPT");//String
        listKDK.add(1);//Integer
        listKDK.add(true);//Boolean

        //ArrayList có định kiểu 
        //Kiểu dữ liệu chỉ định trước: Integer
        //không dc sử dụng kiểu nguyên thủy: int, double, float,...
        //sử dụng lớp dữ liệu (wrapper lớp bao): Integer, Double, Float,...
        List<Integer> arrListCDKInt = new ArrayList<>();
        arrListCDKInt.add(9);
        arrListCDKInt.add(5);
        arrListCDKInt.add(0);

        //3. Truy xuất dữ liệu
        //sử dụng phương thức get (index) => lấy ra phần tử tại vị trí index
        System.out.println(listKDK.get(2));
        System.out.println("Kích cỡ của arrayList size= " + listKDK.size());
        for (int i = 0; i < listKDK.size(); i++) {
            System.out.println(listKDK.get(i));
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
