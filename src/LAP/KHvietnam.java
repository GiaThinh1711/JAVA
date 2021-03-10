package LAP;
public class KHvietnam extends KhachHang{
    protected KHvietnam(int ma, double dgia, String ngay, String hoten, int sl, double ttien) {
        super(ma, dgia, ngay, hoten, sl, ttien);
    }

    @Override
    protected double getThanhTien() {
        return super.getThanhTien();
    }

    @Override
    protected void setThanhTien(double thanhTien) {
        super.setThanhTien(thanhTien);
    }

    @Override
    protected int getId() {
        return super.getId();
    }

    @Override
    protected void setId(int id) {
        super.setId(id);
    }

    @Override
    protected String getName() {
        return super.getName();
    }

    @Override
    protected void setName(String name) {
        super.setName(name);
    }

    @Override
    protected String getNgayRahoadon() {
        return super.getNgayRahoadon();
    }

    @Override
    protected void setNgayRahoadon(String ngayRahoadon) {
        super.setNgayRahoadon(ngayRahoadon);
    }

    @Override
    protected String getDoiTuongKH() {
        return super.getDoiTuongKH();
    }

    @Override
    protected void setDoiTuongKH(String doiTuongKH) {
        super.setDoiTuongKH(doiTuongKH);
    }

    @Override
    protected int getSoLuong() {
        return super.getSoLuong();
    }

    @Override
    protected void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong);
    }

    @Override
    protected int getDonGia() {
        return super.getDonGia();
    }

    @Override
    protected void setDonGia(int donGia) {
        super.setDonGia(donGia);
    }

    @Override
    protected float getDinhMuc() {
        return super.getDinhMuc();
    }

    @Override
    protected void setDinhMuc(float dinhMuc) {
        super.setDinhMuc(dinhMuc);
    }

    protected KHvietnam() {
        super();
    }

    @Override
    protected void Input() {
        super.Input();
    }

    @Override
    public void thanhTien() {
        super.thanhTien();
    }
}
