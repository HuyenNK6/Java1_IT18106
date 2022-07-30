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
public class SinhVien extends Nguoi {
    /*
    - Lớp bậc dưới gọi là lớp con
    - sử dụng từ khóa "extends" để kế thừa từ lớp cha
    - Java chỉ đơn kế thừa: tức là 1 lớp chỉ có 1 lớp cha duy nhất
    - Lớp con chỉ còn các thuộc tính đặc trưng riêng để miêu tả đối tượng con này
    */
    private String msv;
    private String mailFpt;

    public SinhVien() {
    }

    public SinhVien(String msv, String mailFpt,
            String hoTen, int tuoi, String diaChi, String sdt, String cccd) {
        super(hoTen, tuoi, diaChi, sdt, cccd);
        this.msv = msv;
        this.mailFpt = mailFpt;
    }
    /*
    - this: dùng để tham chiếu tới thuộc tính và phương thức của lớp hiện tại
    - super: dùng để tham chiếu tới thuộc tính và phương thức của lớp cha
    
    - Lớp con không kế thừa hàm tạo của lớp cha
    => sử dụng "super" để nó gọi đến
    */

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getMailFpt() {
        return mailFpt;
    }

    public void setMailFpt(String mailFpt) {
        this.mailFpt = mailFpt;
    }

    @Override
    public String toString() {
        return super.toString()+ "SinhVien{" + "msv=" + msv + ", mailFpt=" + mailFpt + '}';
    }
    //Ghi đè phương thức
    //Insert Code=> Override Method => xuat()
//Ghi đè lại phương thức xuat() của lớp cha- NGười
    @Override
    public void xuat() {
//        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Đây  là lớp con");
    }
    
}
