package ss5;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person{
    String classListl;
    int Luong;
    String subjectList;

    public String getClassListl() {
        return classListl;
    }

    public void setClassListl(String classListl) {
        this.classListl = classListl;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int luong) {
        Luong = luong;
    }

    public String getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }

    public void inputGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách lớp học: ");
        setClassListl(sc.nextLine());
        System.out.println("Mức lương: ");
        setLuong(sc.nextInt());
        System.out.println("Danh sách môn học: ");
        setSubjectList(sc.nextLine());
    }

    public void outputGV(){
        System.out.println("Danh sách lớp: " + this.getClassListl());
        System.out.println("Danh sách lớp: " + this.getLuong());
        System.out.println("Danh sách lớp: " + this.getSubjectList());
    }
}
