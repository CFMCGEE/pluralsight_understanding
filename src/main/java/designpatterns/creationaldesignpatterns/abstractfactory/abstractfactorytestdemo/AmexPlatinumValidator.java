package designpatterns.creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
