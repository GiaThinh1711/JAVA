package com.company;

public class Product {
    int MaSP;
    String name;
    double GiaTien;
    int SoLuong;
    String DonVi;
    void changeSoLuong(int Q){
        SoLuong += Q;
    }
    void changeGiaTien(double P){
        GiaTien += P;
    }
    boolean check(){
        if(SoLuong>0) return true;
        return false;
    }
}
