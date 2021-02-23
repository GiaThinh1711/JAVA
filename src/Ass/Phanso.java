package Ass;

import java.util.Scanner;

public class Phanso {
        int Tuso,Mauso;
        int Tuso2,Mauso2;
        public int getTuso() {
            return Tuso;
        }

    public int getTuso2() {
        return Tuso2;
    }

    public int getMauso2() {
        return Mauso2;
    }

    public void setMauso2(int mauso2) {
        Mauso2 = mauso2;
    }

    public void setTuso2(int tuso2) {
        Tuso2 = tuso2;
    }

    public void setTuso(int tuso) {
            Tuso = tuso;
        }

        public int getMauso() {
            return Mauso;
        }

        public void setMauso(int mauso) {
            Mauso = mauso;
        }
        public void Nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Tử số thứ nhất: ");
            Tuso = sc.nextInt();
            System.out.println("Mẫu số thứ nhất: ");
            Mauso = sc.nextInt();
            System.out.println("Tử số thứ hai: ");
            Tuso2 = sc.nextInt();
            System.out.println("Mẫu số thứ hai: ");
            Mauso2 = sc.nextInt();
        }
        public boolean Checkphanso(int a,int b){
            if(a != 0 && b == 0){
                return false;
            }else  return true;
        }
        public void Inramanhinh(){
            if(Checkphanso(getTuso(),getMauso())){
                System.out.println("Phân số thứ nhất là: " + getTuso() + "/" + getMauso());
            }
            if(Checkphanso(getTuso2(),getMauso2())){
                System.out.println("Phân số thứ hai là: " + getTuso2() + "/" + getMauso2());
            }
        }
    public void Cong(){
        Phanso ps = new Phanso();
        int a = getTuso() * getMauso2() + getTuso2() * getMauso();
        int b = getMauso() * getMauso2();
        if(a == 0){
            System.out.println("Phân số là : 0");
        }else{
            if (a == b)
                System.out.println("Phân số là : 1");
            else System.out.println("Phép cộng: " + a + "/" + b);
        }
    }
    public void Tru(){
        Phanso ps = new Phanso();
        int a = getTuso() * getMauso2() - getTuso2() * getMauso();
        int b = getMauso() * getMauso2();
        if(a == 0){
            System.out.println("Phân số là : 0");
        }else{
            if (a == b)
                System.out.println("Phân số là : 1");
            else System.out.println("Phép trừ: " + a + "/" + b);
        }
    }
    public void Nhan(){
        Phanso ps = new Phanso();
        int a = getTuso() * getTuso2();
        int b = getMauso() * getMauso2();
        if(a == 0){
            System.out.println("Phân số là : 0");
        }else{
            if (a == b)
                System.out.println("Phân số là : 1");
            else System.out.println("Phép nhân: " + a + "/" + b);
        }
    }
    public void Chia(){
        Phanso ps = new Phanso();
        int a = getTuso() * getMauso2();
        int b = getMauso2() * getTuso();
        if(a == 0){
            System.out.println("Phân số là : 0");
        }else{
            if (a == b)
                System.out.println("Phân số là : 1");
            else System.out.println("Phép chia: " + a + "/" + b);
        }
    }
    public int ucln(int a, int b){
        while (a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public void Rutgon(int x,int y){
        int rgt, rgm;
        rgt = x / ucln(Math.abs(x),Math.abs(y));
        rgm = y / ucln(Math.abs(x),Math.abs(y));
        if(rgt == 0){
            System.out.println("Phân số rút gọn là : 0");
        }else{
            if (rgt == rgm)
                System.out.println("Phân số rút gọn là : 1");
            else System.out.println("Phân số rút gọn là: " + rgt + "/" + rgm);
        }
    }
}
