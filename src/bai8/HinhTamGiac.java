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
public class HinhTamGiac extends Hinh {

    private double a;
    private double b;
    private double c;

    public HinhTamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public HinhTamGiac() {
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }
//mặc định đúng cạnh tam giác
    @Override
    public double tinhDienTich() {
        double p= (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tam Giac");
    }

}
