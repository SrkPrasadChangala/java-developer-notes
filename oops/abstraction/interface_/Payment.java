package oops.abstraction.interface_;

public class Payment {
    public void pay(int method) {
        PaymentCreator paymentCreator = new PaymentCreator();
        /* 
        Payable payable = PaymentCreator.getPaymentMethod(method);
        if (payable != null) {
            payable.pay();
        } else {
            System.out.println("Invalid payment method");
        }
        */
        Payable payable = paymentCreator.getPaymentMethod(method);
        if (payable != null) {
            payable.pay();
        } else {
            System.out.println("Invalid payment method");
        }
    }
}