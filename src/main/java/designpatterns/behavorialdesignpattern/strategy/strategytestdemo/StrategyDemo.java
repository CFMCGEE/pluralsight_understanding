package designpatterns.behavorialdesignpattern.strategy.strategytestdemo;

public class StrategyDemo {

    public static void main(String[] args) {

        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("371090057260061");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("37109005457260061");
        amexCard2.setDate("04/2020");
        amexCard2.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4916932755120499");
        visaCard.setDate("05/2023");
        visaCard.setCvv("456");

        System.out.println("Is Visa valid: " +  visaCard.isValid());

    }

}
