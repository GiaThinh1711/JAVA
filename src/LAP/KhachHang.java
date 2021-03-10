package LAP;

import java.util.Scanner;

public class KhachHang {
    int id;
    String name, ngayRahoadon, doiTuongKH;
    int soLuong;
    int donGia;
    float dinhMuc;
    double thanhTien;

    protected KhachHang(int ma, double dgia, String ngay, String hoten, int sl, double ttien) {
        this.name = "";
        this.ngayRahoadon = "";
        this.doiTuongKH = "";
        this.soLuong = 0;
        this.donGia = 0;
        this.id = 0;
        this.dinhMuc = 0;
        this.thanhTien = 0;
    }

    protected double getThanhTien() {
        return thanhTien;
    }

    protected void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getNgayRahoadon() {
        return ngayRahoadon;
    }

    protected void setNgayRahoadon(String ngayRahoadon) {
        this.ngayRahoadon = ngayRahoadon;
    }

    protected String getDoiTuongKH() {
        return doiTuongKH;
    }

    protected void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    protected int getSoLuong() {
        return soLuong;
    }

    protected void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    protected int getDonGia() {
        return donGia;
    }

    protected void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    protected float getDinhMuc() {
        return dinhMuc;
    }

    protected void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    protected KhachHang() {
        this.id = id;
        this.name = name;
        this.ngayRahoadon = ngayRahoadon;
        this.doiTuongKH = doiTuongKH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    protected void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên KH: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày ra hóa đơn: ");
        ngayRahoadon = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        soLuong = sc.nextInt();
        System.out.println("Nhập đơn giá: ");
        donGia = sc.nextInt();
    }

    public void thanhTien(){
        if(dinhMuc < 50){
           thanhTien = donGia * dinhMuc + (soLuong - dinhMuc) * 1000;
           System.out.println("Hóa đơn của bạn là: " + thanhTien);
        }else if(50 < dinhMuc && dinhMuc < 100 ){
            thanhTien = donGia * dinhMuc + (soLuong - dinhMuc) * 1200;
            System.out.println("Hóa đơn của bạn là: " + thanhTien);
        }else if(100 < dinhMuc && dinhMuc < 200){
            thanhTien = donGia * dinhMuc + (soLuong - dinhMuc) * 1500;
            System.out.println("Hóa đơn của bạn là: " + thanhTien);
        }else if(dinhMuc > 200){
            thanhTien = donGia * dinhMuc + (soLuong - dinhMuc) * 2000;
            System.out.println("Hóa đơn của bạn là: " + thanhTien);
        }
    }
}
