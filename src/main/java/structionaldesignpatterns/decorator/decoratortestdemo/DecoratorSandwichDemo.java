package structionaldesignpatterns.decorator.decoratortestdemo;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {

        //Not a creational because it is having its structure modified
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());

    }
}
