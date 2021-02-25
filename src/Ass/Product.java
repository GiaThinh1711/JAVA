package Ass;

import java.util.Scanner;

public class Product {
    int id;
    String productName;
    int qty;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Constructor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = sc.nextInt();
        System.out.println("Nhập tên sp: ");
        productName = sc.next();
        System.out.println("Nhập số lượng: ");
        qty = sc.nextInt();
        System.out.println("Nhập giá: ");
        price = sc.nextInt();
    }

    public void checkHang(int x) {
        if (x > 0) {
            System.out.println("Còn hàng: " + x + " chiếc");
        } else System.out.println("Hết hàng");
    }

    public static void main(String[] args) {
        Product pd = new Product();
        pd.Constructor();
        pd.checkHang(pd.getQty());
    }
}
