/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap2;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1AccountTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Bai1Account ac = new Bai1Account();
        Bai1AccountList acl = new Bai1AccountList();
        
    int Chon;
    do {
        acl.menuChucNang();
        System.out.print("Chọn chức năng: ");
        Chon=sc.nextInt();
        
        switch(Chon) {
            case 1: { acl.ThemDSTK(ac);                               break; }
            case 2: { acl.XuatSoTK();                                   break; }
            case 3: { acl.XuatDSTK();                                   break; }
            case 4: { acl.NapTien();                                    break; }
            case 5: { acl.RutTien();                                    break; }
            case 6: { acl.ChuyenTien();                                 break; }
            case 7: { System.out.println("Kết thúc chương trình");       break; }
                case 8: {
                    int tk;
                    System.out.println("Nhập số tài khoản muốn tìm: ");
                    tk=sc.nextInt();
                    acl.Tim(tk); break; }
                case 9: {
                    int tk;
                    System.out.println("Nhập số tài khoản muốn xóa: ");
                    tk=sc.nextInt();
                    acl.Xoa(tk); break; }
                case 10: { acl.Tinh(); break; }
            default: System.out.println("\nKhông có lựa chọn này\n"); break; 
        }
    }
    while(Chon!=7);
        System.out.println("\n\t\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\t\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}