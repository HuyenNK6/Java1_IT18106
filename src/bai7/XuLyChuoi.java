/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author HuyenNK
 */
public class XuLyChuoi {

    public static void main(String[] args) {
        /*
        Ký tự đặc biệt
        \t: tab
        \n: xuống dòng
        \r: về đầu dòng
        \\: \
        \": "
         */
        System.out.println("hello " + "\r" + "good" + "\r" + "bye");
        System.out.println("\t Xin chào: Huyền \n\t+ Tuổi: 18");

        //Xử lý chuỗi
        String name = "       FPT Poly     ";
        //toLowerCase(): đổi hết về chữ thường
        System.out.println(name.toLowerCase());
        //toUpperCase(): đổi hết về chữ hoa
        System.out.println(name.toUpperCase());
        //trim(): xóa khoảng trắng ở đầu và cuối
        System.out.println(name + " Java");
        System.out.println(name.trim() + " Java");
        //lenght(): đo độ dài của chuỗi
        System.out.println(name.trim().length());

        //
        String ngayHoi = "Ngày hội tuyển dụng";
        //substring(): cắt chuỗi thành chuỗi con
        //trả về chuỗi con từ vị trí beginIndex= 5 => hết
        System.out.println(ngayHoi.substring(5));
        //trả về chuỗi con từ vị trí beginIndex= 5 đến endIndex= 9
        System.out.println(ngayHoi.substring(5, 9));
        //charAt(index): char lấy ký tự tại vị trí index= 0
        System.out.println(ngayHoi.charAt(0));
        //replaceAll (find, replace): thay thế
        //thay từ Ngày= Day
        System.out.println(ngayHoi.replaceAll("Ngày", "Day"));
        //split(separator): 
        // tách chuỗi theo biểu thức chính quy
        // (regular expression)
        // và trả về mảng chuỗi
        // tách chuỗi theo khoảng trắng
        String ngayHoi2 = "Ngày        hội     tuyển dụng";
        String [] tu= ngayHoi2.split("\\s+");
        for (String t : tu) {
            System.out.println(t);
        }
        
        //So sánh String
        //equals(): ss có phân biệt
        //equalsIgnoreCase():  ss ko phân biệt
        //chữ hoa chữ thường
        String username= "HuyenNK";
        if(username.equals("huyennk")){
            System.out.println("Đăng nhập thành công");
        }else{
            System.out.println("Tên ĐN sai");
        }
        if(username.equalsIgnoreCase("huyennk")){
            System.out.println("Đăng nhập thành công");
        }
        //
        String tenTruong= "FPT Polytechnic";
        //contains() kiểm tra có chứa ... hay ko? 
        //=> boolean
        System.out.println(tenTruong.contains("huyen"));
        //startWith() kiểm tra có bắt đầu bởi... hay ko?
        System.out.println(tenTruong.startsWith("FPT"));
        //endWith() kiểm tra có kết thúc bởi... hay ko?
        System.out.println(tenTruong.endsWith("?"));
        
        //matches(): so sánh khớp hay ko?
        String regex="(.*)Poly(.*)";
        System.out.println(tenTruong.matches(regex));
        
        /*
        KÝ TỰ ĐẠI DIỆN
        [xyz] | đại diện 1 ký tự x, y, z
        [ad-f]| đại diện 1 ký tự a, d, e, f
        [^xyz]| đại diện 1 ký tự không thuộc x, y, z
        [x|y] | đại diện ký tự x hoặc y
        \d    | khớp với một kí tự số. 
                tương đương [0-9]
        \w    | khớp với tất cả kí tự là chữ, số và gạch dưới. 
                tương đương [0-9a-zA-Z_]
        \D    | khớp với một kí tự không phải là số. 
                tương đương [\^d] hoặc [^0-9]
        \W    | khớp với tất cả kí tự không phải là chữ, số và gạch dưới. 
                tương đương [\^w] hoặc [^0-9a-zA-Z_]
        \s    | đại diện ký tự trắng
        .     | đại diện 1 ký tự bất kỳ
        ^     | chỉ ra mẫu bắt đầu
        $     | chỉ ra mẫu kết thúc
        \\, \., \$, \^ | đại diện "\", ".", "$", "^"
        
        SỐ LẦN XUẤT HIỆN
        {M,N}   | ít nhất M lần, nhiều nhất N lần
        {N}     | đúng N lần
        {N,}    | xảy ra N hoặc nhiều lần
        ?       | 0-1 lần
        *       | 0-Nhiều lần
        +       | 1-Nhiều lần
        Không   | 1 lần
     */
        
        
    }
}
