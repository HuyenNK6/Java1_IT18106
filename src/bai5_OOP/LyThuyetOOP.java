/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

/**
 *
 * @author HuyenNK
 */
public class LyThuyetOOP {
    /*
    LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG- Oject Oriented Programming- OOP
    đưa các đối tượng trong thế giới thực vào trong lập trình
    để thao tác vs ĐỐI TƯỢNG (thêm, sửa, xóa,..) hoặc vs các THUỘC TÍNH
    (thông tin).
    Object còn có các hành động => PHƯƠNG THỨC
    
    *4 tính chất của OOP
    - TC1: TÍnh đa hình (Polymophism)
        phương thức giống nhau => kết quả khác nhau
        + Overloading: Nạp chồng phương thức
            cùng tên, cùng kiểu, khác tham số truyền vào
        + OVerriding: Ghi đè phương thức
            cùng tên, cùng kiểu, cùng tham số truyền vào
    - TC2: Tính đóng gói (Encapsulation)
        trạng thái của đối tượng đc bảo vệ ko cho truy cập từ code bên ngoài
    => Tính đóng gói dc thể hiện thông qua phạm vi truy cập access modifiers
    2 loại: access modifiers và non-access modifiers
        + 4 loại access modifiers:
            - private
            - (default)
            - protected
            - public
        + non-access modifiers: static, abstract,synchronized,...
    - TC3: TÍnh trừu tượng: 
        TỔng quát hóa 1 cái gì đó => ko cần chú ý tới chi tiết bên trong
    - TC4: TÍnh kế thừa:
    cho phép định nghĩa 1 lớp đối tuwjonwgj dựa trên các thuộc tính có sẵn
    của 1 lớp đã có
    
    KHÁI NIỆM:
    - Class (Lớp): xem lớp như là 1 khuôn mẫu của đói tượng
        trong lướp, bao gồm: thuộc tính,dữ liệu của đối tương (field hoặc properties)
        và các phương thức (methods)
    - ĐỐi tượng: thuộc tính (attribute) và phương thức (method)
    - Phương thức: là 1 nhóm các câu lệnh cùng nhau thực hiện 1 công việc
    - Từ khóa this.
    
    */
    public static void main(String[] args) {
            int tong1= tong(5, 8);
            int tong2= tong(2, 4, 6);
            System.out.println(tong1);
            System.out.println(tong2);
    }
    public static int tong(int a, int b){
        return a+b;
    }
    public static int tong(int a, int b, int c){
        return a+b+c;
    }
}
