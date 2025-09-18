package oops.abstraction.interface_;
import java.util.Scanner;

public class Main {
    public static void main(String[] a44rgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a payment method:");
        System.out.println("1. Debit Card");
        System.out.println("2. Net Banking");
        System.out.println("3. Paytm");
        System.out.println("4. UPI");
        
        int choice = sc.nextInt();
        Payment payment = new Payment();
        System.out.println("Processing payment...");
        payment.pay(choice);
    }
}