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
/*
- Tạo 1 class lớp đối tượng sinh viên
- Tên đối tượng phải viết hoa chữ cái đầu tiên
- HocSinh, SachVo, SanPham, DongVat,..
*/
public class SinhVien {
    //1. Các thuộc tính mà đối tượng cần có
    private String msv; //private các thuộc tính
    private String hoTen;//khi private thì chỉ dc sử dụng trong class
    private String email;
    private String diaChi;
    private int tuoi;
    private double diem;
    
    // 2. Constructor: hàm tạo
    // 2 loại Constructor
    //Ctrl+ cách+ enter
    // Chuột phải+ Insert Code (Alt+Insert) => Constructor
    //Constructor không tham số
    public SinhVien() {
    }
    // Constructor có tham số
    public SinhVien(String msv, String hoTen, String email, String diaChi, int tuoi, double diem) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public SinhVien(String msv, String hoTen) {
        this.msv = msv;
        this.hoTen = hoTen;
    }
    
    //3. Getter và Setter
    // Vì khi thuộc tính bị Private=> muốn lấy (get) và gán (set) giá trị
    // => phải sử dụng Getter và Setter
 // Chuột phải+ Insert Code (Alt+Insert) => Getter and Setter

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", hoTen=" + hoTen + ", email=" + email + ", diaChi=" + diaChi + ", tuoi=" + tuoi + ", diem=" + diem + '}';
    }

    

 

 
    
}
