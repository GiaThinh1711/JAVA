package ss2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SoNguyenTo snt = new SoNguyenTo();
        System.out.println("Nhap so vao day: ");
        int a = sc.nextInt();
        snt.setA(a);
        System.out.println("SNT tiep theo: " + snt.timSoNguyenToTiepTheo());
        if(snt.isSoNguyenTo(a) == false){
            System.out.println("Vui long nhap lai");
        }
    }
}
