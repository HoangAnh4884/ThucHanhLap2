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
public class Bai2CD {
    int maCD, soBaiHat, giaThanh;
    String tuaCD;

    public Bai2CD() {
    }

    public Bai2CD(int maCD, int soBaiHat, int giaThanh, String tuaCD) {
        this.maCD = maCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
        this.tuaCD = tuaCD;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    
    Scanner sc = new Scanner(System.in);

    void nhap() {
        System.out.println("Nhập mã CD: "); maCD=sc.nextInt();
        System.out.println("Nhập tựa CD: "); tuaCD=sc.nextLine();
        System.out.println("Nhập số bài hát: "); soBaiHat=sc.nextInt();
        System.out.println("Nhập giá thành: "); giaThanh=sc.nextInt();
            if(maCD<=0) {
                System.out.println("Lỗi mã CD, đưa về mặt định");
                setMaCD(999999);
            }
            if(tuaCD=="" || tuaCD==" ") {
                System.out.println("Lỗi tựa CD, đưa về mặt định");
                setTuaCD("chưa xác định");
            }
            if(soBaiHat<=0) {
                System.out.println("Lỗi số bài hát, đưa về 1");
                setSoBaiHat(1);
            }
            if(giaThanh<=0) {
                System.out.println("Lỗi giá thành, đưa về 1");
                setGiaThanh(1);
            }
    }
    
    void xuat() {
        System.out.println(getMaCD()+"\t\t"+getTuaCD()+"\t\t\t"+getSoBaiHat()+"\t\t"+getGiaThanh());
    }
}