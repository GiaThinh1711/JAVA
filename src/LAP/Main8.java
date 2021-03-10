package LAP;

public class Main8 {
    public static void main(String[] args){
        KHvietnam kh1 = new KHvietnam();
        KHvietnam kh2 = new KHvietnam();
        KHnuocngoai khnn1 = new KHnuocngoai();
        KHnuocngoai khnn2 = new KHnuocngoai();
        kh1.Input();
        kh2.Input();
        kh1.thanhTien();
        kh2.thanhTien();
        khnn1.Input();
        khnn2.Input();
        khnn1.thanhTien();
        khnn2.thanhTien();
    }
}
