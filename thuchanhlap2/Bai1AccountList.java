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
public class Bai1AccountList {
    ArrayList<Bai1Account> ac;
    
    public Bai1AccountList() {
        ac = new ArrayList<>();
    }
    
        //AccountList = Quản lý
    
    Scanner sc = new Scanner(System.in);
    
    
    public void ThemDSTK(Bai1Account a) {
        System.out.print("\nNhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("\nLần nhập thứ " +(i+1)+ ": ");
            if(a instanceof Bai1Account) {
                a=new Bai1Account();
                a.nhap();
            }
            ac.add(a);
        }
    }
    
    public void XuatSoTK() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.print("\nCác tài khoảng hiện có: ");
        for(Bai1Account x: ac) {
            x.xuatSoTK();
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    
    public void XuatDSTK() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.println("Số TK\t\tTên TK\t\t\t\tSố Tiền\t\tTrạng Thái");
        System.out.println("-----------------------------------------------------------------------------");
        for(Bai1Account x: ac) {
            x.xuat();
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    
    void NapTien() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        int tk; double n;
        System.out.print("\nNhập số tài khoản cần nạp: ");
        tk=sc.nextInt();
        System.out.print("\nNhập số tiền cần nạp vào tài khoản: ");
        n=sc.nextDouble();
        for(Bai1Account x: ac) {
            if(x instanceof Bai1Account) {
                x.nap(n);
            }
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void RutTien() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.print("\nNhập số tài khoản cần rút: ");
        sc.nextInt();
        double r;
        System.out.print("\nNhập số tiền cần rút từ tài khoản: ");
        r=sc.nextDouble();
        for(Bai1Account x: ac) {
            x.rut(r);
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void ChuyenTien() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.print("\nNhập số tài khoản thực hiện chuyển khoản: ");
        double c;
        sc.nextInt();
        System.out.print("\nNhập số tiền cần chuyển: ");
        c=sc.nextDouble();
        for(Bai1Account x: ac) {
            x.rut(c);
        }
        System.out.print("\nNhập số tài khoản được chuyển khoản: ");
        sc.nextInt();
        for(Bai1Account x: ac) {
            x.nap(c);
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void Tim(int tk) {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        for(Bai1Account x: ac) {
            if(x instanceof Bai1Account) {
                x.xuat();
            }
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void Xoa(int tk) {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        for(Bai1Account x: ac) {
            if(x instanceof Bai1Account) {
                ac.remove(x);
            }
        }
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void Tinh() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        int x;
        x=ac.size();
        System.out.print("\nSố lượng tài khoản hiện có là: " +x);
    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
    }
    
    void menuChucNang() {
    System.out.println("\n____________________Menu Chức Năng____________________");
        System.out.println("1: Thêm tài khoản");
        System.out.println("2: Xuất số tài khoản hiện có");
        System.out.println("3: Xuất thông tin tất cả các tài khoản");
        System.out.println("4: Nạp tiền");
        System.out.println("5: Rút tiền");
        System.out.println("6: Chuyển tiền");
        System.out.println("7: Kết thúc");
        System.out.println("\t8: Tìm tài khoản");  //Thêm
        System.out.println("\t9: Xóa tài khoản");  //Thêm
        System.out.println("\t10: Tính số lượng tài khoản hiện có");  //Thêm
    System.out.println("______________________________________________________\n");
    }
}