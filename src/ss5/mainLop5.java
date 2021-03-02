package ss5;

public class mainLop5 {
    public static void main (String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Nguyễn Gia Thịnh","Nam","17/11/2002","HN");
        p1.showInfo();
        p2.showInfo();
        Student sd = new Student();
        sd.inputInfo();
        sd.showInfo();
        GiaoVien gv = new GiaoVien();
        gv.inputGV();
        gv.outputGV();
    }
}
