package designpatterns.creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

public class VisaGoldValidator implements VisaValidator {

    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }

}