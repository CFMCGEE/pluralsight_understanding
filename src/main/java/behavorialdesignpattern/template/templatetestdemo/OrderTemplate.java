package behavorialdesignpattern.template.templatetestdemo;

public abstract class OrderTemplate {

    public boolean isGift; //Hook
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    public final void processOrder() {

        doCheckout();
        doPayment();

        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();

    }

}
