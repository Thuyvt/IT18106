/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it18106;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QLSV {

    List<SinhVien> listSinhVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QLSV() {
    }

    // Nhap sv
    public void nhapSv() {
        while (true) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhap ma sv:");
            sv.setMaSv(sc.nextLine().trim());
            System.out.println("Nhap ho va ten sv:");
            sv.setHoTen(sc.nextLine().trim());
            System.out.println("Nhap chuyen nganh");
            sv.setHoTen(sc.nextLine().trim());

            // Them sinh vien vao danh sach
            listSinhVien.add(sv);

            // Hoi nhap tiep hay khong
            System.out.println("Ban co muon nhap tiep khong(Y/N)");
            if (sc.nextLine().trim().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    // Xuat danh sach sinh vien
    public void xuatDv() {
        for (SinhVien v: listSinhVien) {
            v.inThongTin();
        }
    }
    
    // Tim sinh vien theo ma
    public void timSv() {
        System.out.println("Nhap ma sinh vien can tim: ");
        String ma = sc.nextLine();
        // C1
        for (SinhVien s : listSinhVien) {
            if (s.getMaSv().equalsIgnoreCase(ma)) {
                s.inThongTin();
            }
        }
        
        // C2:
        List<SinhVien> result = listSinhVien.stream()
                .filter(item -> item.getMaSv().equalsIgnoreCase(ma))
                .collect(Collectors.toList());
        result.forEach(a -> a.inThongTin());
    }

    // Sap xep sv theo chuyen nganh
    public void sapXep() {
        Collections.sort(listSinhVien);
        xuatDv();
    }
}
