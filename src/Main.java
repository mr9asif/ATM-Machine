import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmInterface op = new AtmOperation();
     int atmNum=123456;
     int pin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Atm Number: ");
        int num = in.nextInt();
        System.out.println("Enter your Pin: ");
        int pins = in.nextInt();
        if((pin == pins ) && (atmNum == num)){
            while (true) {

                System.out.println("\n1. Check Balance \n2. Withdraw Balance \n3. Deposit Cash \n4. Exit");
                System.out.print("Enter a valid number: ");
                int no = in.nextInt();

                if (no == 1) {
                    op.vewBalance();
                } else if (no == 3) {
                    op.setDeposite();
                }else if(no == 2){
                    op.setWithdrew();
                } else if (no == 4) {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break; // Exit the loop and end the program
                } else {
                    System.out.println("Invalid choice! Please enter a valid option.");
                }
            }


        }else{
            System.out.println("Invalid AtmNumber or Pin!");
        }
        in.close();
    }
}