/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author HuyenNK
 */
public class DemoRandom {

    public static void main(String[] args) {
        //random số ngẫu nhiên từ 5-12
        //sử dụng hàm Math.random()
        double number = 5 + 7 * Math.random();
        System.out.println("number= " + number);
        System.out.printf("number= %.3f", number);
        System.out.println();
        int i = 100;
        long l = i;
        double d = l;
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("d= " + d);
        double d1 = 123.456;
        long l1 = (long) d1;
        int i1 = (int) l1;
        System.out.println("d1= " + d1);
        System.out.println("l1= " + l1);
        System.out.println("i1= " + i1);
// Các lớp bao (trừ lớp Character chỉ có một cách khởi tạo) đều có hai cách khởi tạo:
//sử dụng giá trị nguyên thủy để tạo ra đối tượng tương ứng
        Character charObj = new Character('a');
        Boolean boolObj = new Boolean(true);
        Integer intObj = new Integer(2002);
        Float floatObj = new Float(3.14F);
        Double doubleObj = new Double(3.14);
//chuyển thành String biểu diễn cho các giá trị nguyên thủy về các lớp tương ứng. 
//        Boolean boolObj = new Boolean("true");
//        Integer intObj = new Integer("2002");
//        Float floatObj = new Float("3.14F");
//        Double doubleObj = new Double("3.14");

        System.out.println(charObj);
        System.out.println(boolObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);

        //3 cach để bao giá trị nguyên thủy : BOXING
        Integer num1 = new Integer(2); //bao tường minh
        Integer num2 = Integer.valueOf(2);// bao tường minh
        Integer num3 = 2; // bao ngầm định
        System.out.println(num1 + "" + num2 + "" + num3);
        //UNBOXING
        int value1 = num1.intValue(); // mở bao tường minh
        int value2 = num2;// mở bao ngầm định
        System.out.println(value1 + "" + value2);

        Double doub = new Double(8.5);
        double valueDoub = doub.doubleValue();
        System.out.println(valueDoub);

        int s1 = 4;
        int s2 = 6;
        int max = s1 > s2 ? s1 : s2;
        System.out.println(max);

        boolean t = !(s1 > s2);
        System.out.println(t);
        DemoScanner.add();
    }
}
