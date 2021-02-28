package LAP;

import java.util.ArrayList;

public class LopHoc {
    String maLop;
    String tenLop;
    int phongHoc;
    ArrayList<SinhVien> SinhVienList;

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(int phongHoc) {
        this.phongHoc = phongHoc;
    }

    public LopHoc(){
        SinhVienList = new ArrayList<SinhVien>();
    }

    public void addSV(SinhVien SV){
        SinhVienList.add(SV);
    }

    public void removeSV(int index){
        SinhVienList.remove(index);
    }

    public void Printf(){
        System.out.println("Mã lớp: " + getMaLop());
        System.out.println("Tên lớp: " + getTenLop());
        System.out.println("Phòng học: " + getPhongHoc());
        System.out.print("Danh sách SV: ");
        for (SinhVien i :SinhVienList){
            System.out.print( i.hoTen + ", ");
        }
    }
}
