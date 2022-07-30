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
public class Nguoi {
    //Lớp bậc trên gọi là lớp cha
    //Lớp cha chứa các thuộc tính chung
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;
    private String cccd;
    //Constructor

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String diaChi, String sdt, String cccd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.cccd = cccd;
    }
//Getter & Setter

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", sdt=" + sdt + ", cccd=" + cccd + '}';
    }
    public void xuat(){
        System.out.println("Đây là lớp cha");
    }
}
