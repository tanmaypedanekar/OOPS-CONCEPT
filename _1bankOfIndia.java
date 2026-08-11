import java.util.Scanner;

public class _1bankOfIndia {
    Scanner input = new Scanner(System.in);
    private String accHolderName;
    private int accNumber;
    private int currentCash;

    public void withdrawal() {
        System.out.println("Enter amount you want to withdraw: ");
        int withdraw = input.nextInt();
        if (currentCash < withdraw) {
            System.out.println("Insufficient bank balance!!!");
        } else {
            currentCash -= withdraw;
            System.out.println("Your remaining balance is : " + currentCash);
            System.out.println("Transaction completed!!!");
        }
        System.out.println("--------------------------------------------");
    }

    public void deposit() {
        System.out.println("Enter amount you want to deposit: ");
        int deposit = input.nextInt();
        currentCash += deposit;
        System.out.println("Your amount deposited successfully");

        System.out.println("---------------------------------------------");
    }

    public void checkBalance() {
        System.out.println("Your current bank balance is : " + currentCash);

        System.out.println("-----------------------------------------------");
    }

}
