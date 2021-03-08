package Ass;

public interface ISinhVien {
    void addSV(int id,int age,float gpa,String name,String addRess);
    void editSV(int id);
    void deleteSV(String name);
    void sortGPA();
    void sortName();
    void showList();
}
