package LAP;

import java.util.ArrayList;

public class Room {
    String tenPhong;
    String viTri;
    ArrayList<String> user = new ArrayList<String>();

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void addUser(String us){
        user.add(us);
    }

    public void removeUser(int index){
        user.remove(index);
    }

    public void printRoom(){
        System.out.println("Tên phòng: " + getTenPhong());
        System.out.println("Vị trí: " + getViTri());
        System.out.println("Danh sách người : ");
        for(String i :user){
            System.out.println(i);
        }
    }
}

