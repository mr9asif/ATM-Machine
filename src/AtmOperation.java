public class AtmOperation implements AtmInterface {
    Atm obj = new Atm();
    @Override
    public void vewBalance() {
        System.out.println("Available balance : " + obj.getBalance());
    }

    @Override
    public void viewWithdrew() {

    }

    @Override
    public void viewDeposite() {

    }

    @Override
    public void miniStatement() {

    }

}
