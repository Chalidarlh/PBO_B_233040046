package pertemuan13.tugas2;

public class BankAccount {
    private final String accountNumber; //tidak bisa diubah
    protected double balance; //bisa diakses oleh subclass

    //konstruktor
    public BankAccount (String accountNumber){
        this.accountNumber = accountNumber; //inisialisasi nomor rekening
        this.balance = 0.0;
    }

    //method utk menambah saldo
    public void deposit(double amount){ 
        if (amount > 0) {
            balance += amount;
        }
    }

    //method final utk menampilkan informasi akun
    public final void displayAccountInfo(){ 
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
    }
}
