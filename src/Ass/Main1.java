package Ass;
import java.util.Scanner;
class TamGiac {
    public static void main(String[] args) {
        int a,b,c;
        double P;
        float S,C;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        c = scanner.nextInt();
        System.out.println(("Nửa chu vi tam giác là: " + NuaChuVi(a,b,c)));
        System.out.println("Chu vi tam giác là: " + ChuVi(a,b,c));
        System.out.println("Diện tích hình tam giác là: " + DienTich(a,b,c));
        if(a+b<c || a+c<b || c+b<a){
            System.out.println("Nhập lại đi thằng ngu");
        }
    }
    public static double NuaChuVi(int a,int b,int c) {
        return (float)(a+b+c)/2;
    }
    public static double ChuVi(int a,int b,int c){
        return a+b+c;
    }
    public static double DienTich(int a,int b,int c){
        float S;
        float P = (a+b+c)/2;
        return S = (int) Math.sqrt(P*(P-a)*(P-b)*(P-c));
    }
}