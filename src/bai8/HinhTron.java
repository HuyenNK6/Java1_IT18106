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
public class HinhTron extends Hinh {

    private double r;

    public HinhTron() {
    }

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tron");
    }

}
