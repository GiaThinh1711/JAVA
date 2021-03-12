package PRACTICLE;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    String Name;
    String Location;
    String ownerName;
    ArrayList<Hotel> HotelList;

    public Hotel() {
        HotelList = new ArrayList<>();
    }

    public Hotel(String name, String location, String ownerName) {
        Name = name;
        Location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addHotel(String name,String location,String ownerName){
        for (Hotel x:
             HotelList) {
            if(x.getName().equals(name)){
                System.out.println("Khách sạn đã tồn tại");
                return;
            }
        }
        Hotel h = new Hotel(name,location,ownerName);
        HotelList.add(h);
    }

    public void checkHotel(String name){
        Scanner sc = new Scanner(System.in);
        for (Hotel ht:
             HotelList) {
            if(ht.getName().equals(name)){
                System.out.println("Thong tin khac san cua "+ownerName+" la: ");
                System.out.println("Ten khach san: "+ ht.getName()+", vi tri: "+ht.getLocation());
                return;
            }
        }
        System.out.println("Không có kết quả");
    }

    public void outPut(){
        System.out.println(getName() + getLocation() + getOwnerName());
    }
}
