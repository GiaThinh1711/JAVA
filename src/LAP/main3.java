package LAP;

public class main3 {
    public static void main(String[] args){
        Room rm = new Room();
        rm.tenPhong = "T2008M";
        rm.viTri = "non";
        rm.addUser("Nguyễn Gia Thịnh");
        rm.addUser("Nguyễn Quốc Cường");
        rm.addUser("Nguyễn Mạnh");
        rm.removeUser(2);
        rm.printRoom();
    }
}
