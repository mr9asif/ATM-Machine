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

              System.out.println("Wellcome Atm Machine");
              System.out.println("1. Check Balance \n2.Withdrew Balance \n3.Deposite Cash \n4.Exit");
            System.out.println("Enter a valid No.");
            int no = in.nextInt();
            if(no == 1){
             op.vewBalance();
            }

        }else{
            System.out.println("Invalid AtmNumber or Pin!");
        }
    }
}