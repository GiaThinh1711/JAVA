package Ass;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart{
    int id;
    String customerName;
    int grandTotal;
    ArrayList<String> productList = new ArrayList<String>();
    String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void Constructor(){
        System.out.println("Id: " + getId());
        System.out.println("Tên khác hàng: " + getCustomerName());
        System.out.println("Tổng tiền: " + grandTotal);
        System.out.println("Địa chỉ: " + getCity());
        System.out.println("Danh sách sản phẩm: " );
        for(String i: productList){
            System.out.println(i);
        }
    }

    public void addProduct(String pd){
        productList.add(pd);
    }

    public void removeProduct(int index){
        productList.remove(index);
    }

    public void tongTien(int x){
        x = x + 1/100 * x;
    }

    public static void main(String[] args){
        Cart ca = new Cart();
        ca.id = 1;
        ca.customerName = "Nguyễn Gia Thịnh";
        ca.addProduct("Mac");
        ca.addProduct("Asus");
        ca.addProduct("Samsung");
        ca.removeProduct(1);
        ca.grandTotal = 12000;
        ca.city = "Hà Nội";
        ca.Constructor();
        ca.tongTien(ca.getGrandTotal());
    }
}
