/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_quanlysothu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Animal {

    private String maDongVat;
    private String tenDongVat;
    private String gioiTinh;
    private int kichThuoc;
    private int canNang;
    private String mauSac;
    private String thucAn;
    private int tuoi;

    public Animal() {
    }

    public Animal(String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.gioiTinh = gioiTinh;
        this.kichThuoc = kichThuoc;
        this.canNang = canNang;
        this.mauSac = mauSac;
        this.thucAn = thucAn;
        this.tuoi = tuoi;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã động vật: ");
        this.maDongVat = sc.nextLine();
        System.out.print("Nhập tên của động vật: ");
        this.tenDongVat = sc.nextLine();
        System.out.print("Nhập giới tính của động vật: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nhập kích thước của động vật: ");
        this.kichThuoc = sc.nextInt();
        System.out.print("Nhập cân nặng của động vật: ");
        this.canNang = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập màu sắc của động vật: ");
        this.mauSac = sc.nextLine();
        System.out.print("Nhập thức ăn của động vật: ");
        this.thucAn = sc.nextLine();
        System.out.print("Nhập tuổi của động vật: ");
        this.tuoi = sc.nextInt();
    }

    ;
    
    public void xuat() {
        System.out.println("Mã động vật: " + this.maDongVat + " \n" + "Tên động vật: " + this.tenDongVat + "\n" + "Giới tính: " + this.gioiTinh
                + "\n" + "Kích thức: " + this.kichThuoc + "\n" + "Cân nặng: " + this.canNang + "\n"
                + "Màu sắc: " + this.mauSac + "\n" + "Thức ăn: " + this.thucAn + "\n" + "Tuổi: " + this.tuoi);
    }
;
}
