package oops.abstraction.interface_;

public class DebitCard implements Payable{
    public void pay() {
        System.out.println("Payment done using Debit Card");
    }
}