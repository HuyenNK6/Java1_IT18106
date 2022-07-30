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
public abstract class Hinh {
    /*
    - Phương thức trừu tượng: là Phương thức không có phần xử lý code
    và được khai báo bằng từ khóa "abstract"
    - Lớp chứa phương thức trừu tượng thì lớp đó phải là lớp trừu tượng
    - Lớp trừu tượng là lớp có các hành vị chưa được xác định rõ ràng
    
    - Trong lớp trừu tượng vẫn có thể định nghĩa các phương thức cụ thể
    hoặc khai báo các trường
    */
    abstract public double tinhChuVi();
    abstract public double tinhDienTich();
    //Lớp Hình là lớp trừu tượng vì phương thức tính chu vi và diện tích 
    //chưa được thực hiện
     public void xuat(){
        System.out.print("Đây là hình ");
    }
}
