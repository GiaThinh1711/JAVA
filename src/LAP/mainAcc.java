package LAP;

public class mainAcc {
    public static void main(String[] args){
        Account acc1 = new Account();
        Account acc2 = new Account();
        acc2.setId(2);
        acc1.setName("Lê Thành Đạt");
        acc1.setBalance(2000);
        acc1.setId(1);
        acc1.setName("Nguyễn Gia Thịnh");
        acc1.setBalance(1000000000);
        acc1.Credit((int)acc1.getBalance());
        acc1.Debit((int)acc1.getBalance());
        acc1.Transfer(acc1,acc2);
    }
}
