package designpatterns.behavorialdesignpattern.command.commandtestdemo;

//invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

}
