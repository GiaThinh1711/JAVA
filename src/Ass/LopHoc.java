package Ass;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    String name;
    int soLuongHocSinh;
    ArrayList<String> danhSachHocSinh = new ArrayList<String>();

    public LopHoc(String name, int soLuongHocSinh) {
        this.name = name;
        this.soLuongHocSinh = soLuongHocSinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuongHocSinh() {
        return soLuongHocSinh;
    }

    public void setSoLuongHocSinh(int soLuongHocSinh) {
        this.soLuongHocSinh = soLuongHocSinh;
    }

    public ArrayList<String> getDanhSachHocSinh() {
        return danhSachHocSinh;
    }

    public void nhapHS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hs " + getName() + ":");
        for(int i=0;i<getSoLuongHocSinh();i++){
            danhSachHocSinh.add(sc.nextLine());
        }
    }
}
