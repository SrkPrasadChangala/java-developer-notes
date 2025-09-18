package oops.abstraction.interface_;

public class PaymentCreator {
    public Payable getPaymentMethod(int method) {
        switch (method) {
            case 1:
                return new DebitCard();
            case 2:
                return new NetBanking();
            case 3:
                return new Paytm();
            case 4:
                return new UPI();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + method);
        }
    }
}