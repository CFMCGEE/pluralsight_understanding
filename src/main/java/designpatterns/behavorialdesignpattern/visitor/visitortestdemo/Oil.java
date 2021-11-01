package designpatterns.behavorialdesignpattern.visitor.visitortestdemo;

public class Oil implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
