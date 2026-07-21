import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args) {

    //newName = condition ? firstValue : secondvalue;  
    // if condition is true then the firstvalue goes in newName otherwise secondvalue goes in newName;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first number : ");
    int first = input.nextInt();
    System.out.print("Enter your second number : ");
    int second = input.nextInt();

    int greatest = first>second?first:second;

    System.out.println("Greatest number is : "+ greatest);
    input.close();
    }
    
}
