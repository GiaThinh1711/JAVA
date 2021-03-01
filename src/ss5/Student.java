package ss5;

import java.util.Scanner;

public class Student extends Person {
    String maSV;
    int diemThi;
    String email;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(){

    }

    public void nhapTT(){
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        Student sd = new Student();
        sd.setName("Tên: ");
        setName(sc.nextLine());
        sd.setSex("Giới tính: ");
        setSex(sc.nextLine());
        sd.setBirth("30/2/2002");
        setBirth(sc.nextLine());
        sd.setAddress("Địa chỉ: ");
        setAddress(sc.nextLine());
        sd.setMaSV("Mã SV: ");
        setMaSV(sc.nextLine());
        sd.setDiemThi(1);
        setDiemThi(sc.nextInt());
        sc.next();
        sd.setEmail("Email: ");
        setEmail(sc.nextLine());
    }

    public void Print(){
        super.inTT();
        System.out.println("Mã SV: " + getMaSV());
        System.out.println("Điểm thi: " + getDiemThi());
        System.out.println("Email: " + getEmail());
    }

    public boolean checkHocbong(){
        if(getDiemThi() > 8){
            System.out.println("Bạn quá giỏi");
            return true;
        } System.out.println("Bạn quá ngu");
        return false;
    }
}
