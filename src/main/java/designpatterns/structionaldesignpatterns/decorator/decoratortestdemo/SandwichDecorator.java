package designpatterns.structionaldesignpatterns.decorator.decoratortestdemo;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public  SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }

}
