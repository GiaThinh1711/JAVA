package Ass;

public class main6 {
    public static void main (String[] args){
        MonHocDaiCuong m = new MonHocDaiCuong();
        m.themLopHoc("T2008M",2);
        m.themLopHoc("T2009M",1);
        m.themLopHoc("T2007M",3);
        m.inDanhSach();
        m.sapXep();
        System.out.println("Thứ tự là: ");
        m.inDanhSach();
    }
}

