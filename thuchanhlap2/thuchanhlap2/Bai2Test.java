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
public class Bai2Test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Bai2CD cd = new Bai2CD();
        Bai2DSCD ds = new Bai2DSCD();
        
    int Chon;
    do {
        ds.Menu();
        System.out.print("Chọn chức năng: ");
        Chon=sc.nextInt();
        
        switch(Chon) {
            case 1: { ds.ThemDSCD(cd);            break; }
            case 2: { ds.TinhSL();                  break; }
            case 3: { ds.TinhTong();                break; }
            case 4: { ds.SXGDTheoGia();             break; }
            case 5: { ds.SXTDTheoTua();             break; }
            case 6: { ds.XuatDSCD();                break; }
            case 7: { System.out.println("Kết thúc chương trình");       break; }
            default: System.out.println("\nKhông có lựa chọn này\n"); break; 
        }
    }
    while(Chon!=7);
        System.out.println("\n\t\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\t\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}
