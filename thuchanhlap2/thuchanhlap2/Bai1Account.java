/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1Account {
    private double soTien;
    private int soTK;
    private String tenTK, trangThai;
    private double laiSuat;    //Thêm

    public Bai1Account() {
    }

    public Bai1Account(double soTien, int soTK, String tenTK, String trangThai, double laiSuat) {
        this.soTien = soTien;
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.trangThai = trangThai;
        this.laiSuat = (7/2)/100;   //  (7/2)/100=0.035
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    Scanner sc = new Scanner(System.in);
    
    void nhap() {
        System.out.print("\nNhập số tài khoản: "); soTK=sc.nextInt();
        System.out.print("\nNhập tên tài khoản: "); tenTK=sc.nextLine();
        System.out.print("\nNhập số tiền trong tài khoản: "); soTien=sc.nextDouble();
        System.out.print("\nTrạng thái: ");
        if(soTK<=0 || soTK==999999) {
            System.out.print("\n\tLỗi số tài khoản, chuyển thành mặt định: 999999");
            setSoTK(999999);
            setTrangThai("Lỗi, đã đưa về mặt định");
        }
        if(tenTK=="" || tenTK==" ") {
            System.out.print("\n\tLỗi tên tài khoản, chuyển thành mặt định: chưa xác định");
            setTenTK("Chưa xác định");
            setTrangThai("Lỗi, đã đưa về mặt định");
        }
        if(soTien<50) {
            System.out.print("\n\tLỗi số tiền trong tài khoản, chuyển thành mặt định: 50");
            setSoTien(50);
            setTrangThai("Lỗi, đã đưa về mặt định");
        }
    }
    
    void xuatSoTK() {
        System.out.print("\t"+getSoTK());
    }
    
    void xuat() {
        System.out.println(getSoTK()+"\t\t"+getTenTK()+"\t\t\t"+getSoTien()+"\t\t"+getTrangThai());
    }
    
    void nap(double n) {
        double T;
        T=getSoTien()+n;
        setSoTien(T);
        System.out.println("Số tiền hiện tại: " +getSoTien());
    }
    
    void rut(double r) {
        double T;
        T=getSoTien()-r;
        setSoTien(T);
        System.out.println("Số tiền hiện tại: " +getSoTien());
    }
    
    // chuyenTien: c=so tien chuyen; rut(c) từ tk1 ; nap(c) sang tk2
    // tái sử dụng rut(), nap() nên code chuyentien() bên Accountlist
    
    void daoHan() {
        double soDuTruoc, soDuSau;
        soDuTruoc=getSoTien();
        soDuSau= soDuTruoc + (soDuTruoc*laiSuat);
        setSoTien(soDuSau);
    }
}