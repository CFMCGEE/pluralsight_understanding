package creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

public abstract class VisaCreditCard {

    protected int cardNumberLength;
    protected int cscNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }

}
