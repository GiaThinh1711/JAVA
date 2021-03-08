package Ass;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienList implements ISinhVien{
    ArrayList<SinhVien> danhsachSV = new ArrayList<>();

    @Override
    public void addSV(int id, int age, float gpa, String name, String addRess) {

    }

    @Override
    public void editSV(int id) {
        for (SinhVien SV: danhsachSV) {
            if(SV.id == id){
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tên SV: ");
                String name = sc.nextLine();
                System.out.println("Nhập tuổi SV: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String addRess = sc.nextLine();
                System.out.println("Nhập GPA: ");
                float gpa = sc.nextFloat();
            }
        }
    }

    @Override
    public void deleteSV(String name) {

    }

    @Override
    public void sortGPA() {

    }

    @Override
    public void sortName() {

    }

    @Override
    public void showList() {

    }
}
