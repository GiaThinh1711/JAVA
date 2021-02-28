package LAP;

import java.util.Scanner;

public class Account {
    int id;
    String name;
    double balance;
    Scanner sc = new Scanner(System.in);

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){

    }

    public boolean Credit(int Amount){
        int x;
        System.out.println("Nhập số tiền cần nạp: " );
        Amount = sc.nextInt();
        if(Amount >= 0){
            x = (int) (Amount + getBalance());
            System.out.println("Số dư tk là: " + x);
            return true;
        }else{
            System.out.println("Số tiền không hợp lệ");
            return false;
        }
    }

    public boolean Debit(int Amount){
        int x;
        System.out.println("Nhập số tiền cần thanh toán: ");
        Amount = sc.nextInt();
        if(Amount < getBalance()){
            x = (int) (getBalance() - Amount);
            System.out.println("Số dư tk là: " + x);
            return true;
        }else{
            System.out.println("Bạn nghèo vl");
            return false;
        }
    }

    public boolean Transfer(Account acc1, Account acc2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển: ");
        int Amount = sc.nextInt();
        if(acc1.getBalance() > Amount){
            acc1.setBalance(acc1.getBalance() - Amount);
            acc2.setBalance(acc2.getBalance() + Amount);
            System.out.println("Số dư tk1 là: " + acc1.getBalance());
            System.out.println("Số dư tk2 là: " + acc2.getBalance());
            return true;
        }else{
            System.out.println("Bạn nghèo vl");
            return false;
        }
    }
}
