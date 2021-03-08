package Ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainSV {
    public static void main(String[] args){
        ArrayList<SinhVien> danhsachSV = new ArrayList<>();
        SinhVienList svl = new SinhVienList();
        boolean run = true;
        do {
            System.out.println("Chọn chức năng: ");
            System.out.println("1.Thêm SV ");
            System.out.println("2.Sửa SV ");
            System.out.println("3.Xóa SV ");
            System.out.println("4.Sắp xếp theo GPA ");
            System.out.println("5.Sắp xếp theo tên ");
            System.out.println("6.Xem ds ");
            System.out.println("7.Thoát ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập lựa chọn: ");
            int c = sc.nextInt();
            if(c == 0){
                run = false;
            }else if(c == 1){
                System.out.println("Nhập id SV: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên SV: ");
                String name = sc.nextLine();
                System.out.println("Nhập tuổi SV: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String addRess = sc.nextLine();
                System.out.println("Nhập GPA: ");
                float gpa = sc.nextFloat();
                svl.addSV(id,age,gpa,name,addRess);
            }else if(c == 2){
                System.out.println("Nhập id bạn muốn sửa: ");
                svl.editSV(sc.nextInt());
            }else if(c == 3){
                System.out.println("Nhập tên SV cần xóa: ");
                String name = sc.nextLine();
                svl.deleteSV(name);
            }else if(c == 4){
                Collections.sort(svl.danhsachSV, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        return (int) (o1.gpa - o2.gpa);
                    }
                });
            }else if(c == 5){
                Collections.sort(svl.danhsachSV, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        return o1.name.compareTo(o2.name);
                    }
                });
            }else if(c == 6){
                for (SinhVien SV: danhsachSV){
                    System.out.println("Danh sách SV là: ");
                    System.out.println(SV.id +" - " + SV.age +" - " + SV.name +" - " + SV.gpa +" - " + SV.addRess);
                }
            }
        }while (run);
    }
}
