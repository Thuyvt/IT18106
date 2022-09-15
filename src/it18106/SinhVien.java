/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it18106;

/**
 *
 * @author ThuyVT
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSv;
    private String hoTen;
    private String chuyeNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String chuyeNganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.chuyeNganh = chuyeNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyeNganh() {
        return chuyeNganh;
    }

    public void setChuyeNganh(String chuyeNganh) {
        this.chuyeNganh = chuyeNganh;
    }
    
    public void inThongTin() {
        System.out.println("Ma sv:" + this.maSv);
        System.out.printf("Ho va ten %s", this.hoTen);
        System.out.println("Chuyen nganh" + this.chuyeNganh);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.chuyeNganh.compareTo(o.getChuyeNganh());
    }
    
}
