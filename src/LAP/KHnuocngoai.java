package LAP;

import java.util.Scanner;

public class KHnuocngoai extends KhachHang {
    double thanhTien;
    String quocTich;
    public KHnuocngoai(){
        super();
        this.quocTich = "";
    }
    public KHnuocngoai(int ma, double dgia, String ngay, String hoten,int sl, double thanhtien, String qt)
    {
        super(ma, dgia, ngay, hoten, sl, thanhtien);
        this.quocTich=qt;
    }
    public String getquocTich() {
        return quocTich;
    }
    public void setquocTich(String quocTich) {
        quocTich = quocTich;
    }
    public void Input()
    {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quốc Tịch của bạn: ");
        quocTich = sc.next();
    }

    public void thanhTien(){
        thanhTien = donGia * dinhMuc + (soLuong - dinhMuc) * 2000;
        System.out.println("Hóa đơn của bạn là: " + thanhTien);
    }
}
