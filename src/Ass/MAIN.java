package Ass;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args){
        Phanso ps = new Phanso();
        ps.Nhap();
        if(ps.Checkphanso(ps.getTuso(),ps.getMauso()) == false && ps.Checkphanso(ps.getTuso2(),ps.getMauso2()) == false){
            System.out.println("NON LẮM CON Ạ");
        }
        ps.Inramanhinh();
        ps.Rutgon(ps.getTuso(), ps.getMauso());
        ps.Rutgon(ps.getTuso2(), ps.getMauso2());
        ps.Cong();
        ps.Tru();
        ps.Nhan();
        ps.Chia();
    }
}
