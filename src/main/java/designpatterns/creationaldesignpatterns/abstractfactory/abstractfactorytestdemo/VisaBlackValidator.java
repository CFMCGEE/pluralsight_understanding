package designpatterns.creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

public class VisaBlackValidator implements VisaValidator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}
