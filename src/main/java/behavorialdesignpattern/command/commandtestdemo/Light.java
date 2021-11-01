package behavorialdesignpattern.command.commandtestdemo;

//receiver
public class Light {

    private boolean isOn = false; //flag or field

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {

        if(isOn) {

            off();
            isOn = false;

        } else {

            on();
            isOn = true;

        }

    }

    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off.");
    }



}
