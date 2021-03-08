package Ass;
public class SinhVien {
    int id;
    int age;
    String name,addRess;
    Float gpa;

    public SinhVien() {
    }

    public SinhVien(int age, int id, String name, String addRess, float gpa){
        this.id = id;
        this.age = age;
        this.name = name;
        this.addRess = addRess;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }


}
