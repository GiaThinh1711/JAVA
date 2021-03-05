package Ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc {
    ArrayList<LopHoc> danhSachLopHoc ;

    public MonHocDaiCuong(){
        danhSachLopHoc =  new ArrayList<>();
    }
    @Override
    public void themLopHoc(String name, int soluonghocsinh) {
        for (LopHoc lh: danhSachLopHoc) {
            if(lh.getName().equals(name)){
                System.out.println("Lớp này đã có trong danh sách");
                return;
            }
        }
        LopHoc lh = new LopHoc(name,soluonghocsinh);
        lh.nhapHS();
        danhSachLopHoc.add(lh);
    }

    @Override
    public void xoaLopHoc(String name) {
        for (LopHoc lh: danhSachLopHoc) {
            if(lh.getName().equals(name)){
                danhSachLopHoc.remove(lh);
                return;
            }
        }
    }

    @Override
    public void sapXep() {
        Collections.sort(danhSachLopHoc, new Comparator<LopHoc>() {
            @Override
            public int compare(LopHoc o1, LopHoc o2) {
                return o2.getSoLuongHocSinh() - o1.getSoLuongHocSinh();
            }
        });
    }

    @Override
    public void inDanhSach() {
        for (LopHoc lh: danhSachLopHoc){
            System.out.println("Tên lớp "+lh.getName()+ ":");
            System.out.println("Sĩ số: "+lh.getSoLuongHocSinh());
            System.out.println("Danh sách học sinh:");
            for(String s: lh.danhSachHocSinh){
                System.out.println(s);
            }
        }
    }
}
