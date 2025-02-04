import java.util.Scanner;

public class AtmOperation implements AtmInterface {
    Atm obj = new Atm();
    @Override
    public void vewBalance() {
        System.out.println("Available balance : " + obj.getBalance());
    }

    @Override
    public void setWithdrew() {
       Scanner in = new Scanner(System.in);
        System.out.println("Giva withdraw amount: ");
        double wit = in.nextDouble();
        if(wit < 0){
            System.out.println("give a valid withdraw amount");
        }else{
            obj.setWithdraw(wit);

            double bl =  obj.getBalance() - wit;

            if(bl < 0){
                System.out.println("Insufficient balance");
            }else{
                System.out.println(wit + " Withdraw successfully!");
                obj.setBalance(bl);
                System.out.println("Available balance now:" + bl);
            }
        }


    }

    @Override
    public void setDeposite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a deposite amount: ");
        double dep = in.nextDouble();
         obj.setDeposite(dep);
        System.out.println(dep+" deposite successfully added!");
        double bl = dep+ obj.getBalance();
        obj.setBalance(bl);
        System.out.println("Available Balance now:" + obj.getBalance());
    }



}
