package PRACTICLE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hotel ho = new Hotel();
        ho.addHotel("Pyjama Hotel","Hà Nội","Gia Thịnh");
        ho.addHotel("Thiên Thanh Hotel","Hà Nội","Tùng Chó");
        ho.addHotel("Thành Long Hotel","Hà Nội","ĐBRR");
        ho.addHotel("Pan Pacific Hotel","Hà Nội","Tage");
        ho.addHotel("Ruler Hotel","Hà Nội","Hòa Minzi");
        ho.addHotel("Mẹ Ớt Hotel","Hà Nội","Trần Duy Hưng");
        ho.addHotel("Capital Hotel","Hà Nội","Lê Đạt");
        ho.addHotel("Addiction Hotel","Hà Nội","Tùng Nghiện");
        ho.addHotel("FPT Hotel","Hà Nội","Giang Mạnh");
        ho.addHotel("Vins Hotel","Hà Nội","Gino Hướng");
        for (Hotel x:
                ho.HotelList) {
            System.out.println(ho.Name + ho.Location + ho.ownerName);
        }

        ho.checkHotel(ho.Name);
        System.out.println("Nhập tên khách sạn: ");
        System.out.println("Tên khách sạn: " + ho.getName() +"-" + "Địa chỉ: " + ho.getLocation() + "-" + "Chủ sở hữu: " + ho.getOwnerName());
    }
}
