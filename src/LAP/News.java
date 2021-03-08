package LAP;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class News implements laps7 {
    int Id;
    String Title;
    String publishDate;
    String Author;
    String Content;
    float averageRate;
    //ArrayList<Integer> rateList;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println(Title + "-" + publishDate + "-" + Author + "-" + Content + "-" + averageRate);
    }

    int rateList[] = new int[3];

    public void nhapRateList(){
        for(int i = 0; i<rateList.length; i++){
            System.out.println("Mời bạn nhập số thứ "+i);
            Scanner sc = new Scanner(System.in);
            rateList[i] = sc.nextInt();
        }
    }

    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 giá trị: ");
        for(int i=0;i < rateList.length;i++){
            rateList[i] = sc.nextInt();
        }
        for(int i=0;i < rateList.length;i++){
            this.averageRate += rateList[i];
        }
        this.averageRate = averageRate/3;
    }
}
