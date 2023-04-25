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
public class Bai2DSCD {
    ArrayList<Bai2CD> cd;
    
    public Bai2DSCD() {
        cd = new ArrayList<>();
    }
    
        //AccountList = Quản lý
    
    Scanner sc = new Scanner(System.in);
    
    public void ThemDSCD(Bai2CD c) {
        System.out.print("\nNhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("\nLần nhập thứ " +(i+1)+ ": ");
            if(c instanceof Bai2CD) {
                c=new Bai2CD();
                c.nhap();
            }
            cd.add(c);
        }
    }
    
    void TinhSL() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        int x;
        x=cd.size();
        System.out.print("\nSố lượng tài khoản hiện có là: " +x);
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void TinhTong() {
        
    }
    
    void SXGDTheoGia() {
        
    }
    
    void SXTDTheoTua() {
        
    }
    
    public void XuatDSCD() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.println("Mã CD\t\tTựa CD\t\t\t\tSố bài hát\t\tGiá thành");
        System.out.println("--------------------------------------------------------------------");
        for(Bai2CD x: cd) {
            x.xuat();
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    
    void Menu() {
    System.out.println("\n________________Menu Chức Năng________________");
        System.out.println("1: Thêm CD");
        System.out.println("2: Tính số lượng CD trong DS");
        System.out.println("3: Tính tổng giá thành");
        System.out.println("4: Sắp xếp giảm dần theo giá thành");
        System.out.println("5: Sắp xếp tăng dần theo tựa CD");
        System.out.println("6: Xuất toàn bộ thông tin toàn bộ CD");
        System.out.println("7: Kết thúc chương trình");
    System.out.println("______________________________________________\n");
    }
}