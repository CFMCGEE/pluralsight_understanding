package designpatterns.creationaldesignpatterns.abstractfactory.abstractfactorytestdemo;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch(cardType) {

            case GOLD : {
                return new AmexGoldCreditCard();
            }

            case PLATINUM : {
                return new AmexPlatinumCreditCard();
            }

        }

        return null;
    }

    @Override
    public VisaCreditCard getVisaCreditCard(CardType cardType) {

            switch(cardType) {
                case GOLD : {
                    return new VisaGoldCreditCard();
                }

                case BLACK : {
                    return new VisaBlackCreditCard();
                }

            }

         return null;
      }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }

    @Override
    public VisaValidator getVisaValidator(CardType cardType) {
        switch(cardType) {

            case GOLD : {
                return new VisaGoldValidator();
            }

            case BLACK : {
                return new VisaBlackValidator();
            }

        }

        return null;
    }


}
