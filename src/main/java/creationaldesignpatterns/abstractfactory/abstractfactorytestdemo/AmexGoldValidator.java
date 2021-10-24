package creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
