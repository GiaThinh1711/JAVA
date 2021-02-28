package LAP;

public class mainLop {
    public static void main(String[] args){
        LopHoc lh = new LopHoc();
        SinhVien sv1 = new SinhVien();
        sv1.hoTen = "Nguyễn Gia Thịnh";
        SinhVien sv2 = new SinhVien();
        sv2.hoTen = "Lê Đạt";
        SinhVien sv3 = new SinhVien();
        sv3.hoTen = "Hướng Gino";
        SinhVien sv4 = new SinhVien();
        sv4.hoTen = "Mạnh VG";
        SinhVien sv5 = new SinhVien();
        sv5.hoTen = "Tùng Nghiện";
        lh.maLop = "MDHT";
        lh.tenLop = "T2008M";
        lh.phongHoc = 8;
        lh.addSV(sv1);
        lh.addSV(sv2);
        lh.addSV(sv3);
        lh.addSV(sv4);
        lh.addSV(sv5);
        lh.removeSV(4);
        lh.Printf();
    }
}
