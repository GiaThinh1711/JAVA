package ss5;

import java.util.Scanner;

public class Person {
    public String name;
    public String sex;
    public String birth;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(){

    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Tên: ");
        setName(sc.nextLine());
        System.out.println("Giới tính: ");
        setName(sc.nextLine());
        System.out.println("Ngày sinh: ");
        setName(sc.nextLine());
        System.out.println("Địa chỉ: ");
        setName(sc.nextLine());
    }

    public void inTT(){
        System.out.println("Tên SV: " + getName());
        System.out.println("Giới tính: " + getSex());
        System.out.println("Ngày sinh: " + getBirth());
        System.out.println("Địa chỉ: " + getAddress());
    }
}
