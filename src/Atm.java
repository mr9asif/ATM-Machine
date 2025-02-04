public class Atm {
    private  double balance;
    private  double deposite;
    private double withdraw;

    public Atm(){

    }

//    getter function here

    public double getBalance() {
        return balance;
    }

    public double getDeposite() {
        return deposite;
    }

    public double getWithdraw() {
        return withdraw;
    }

//    setter

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDeposite(double deposite) {
        this.deposite = deposite;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
}
