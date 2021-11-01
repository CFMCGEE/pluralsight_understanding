package designpatterns.creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract VisaCreditCard getVisaCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

    public abstract VisaValidator getVisaValidator(CardType cardType);

}
