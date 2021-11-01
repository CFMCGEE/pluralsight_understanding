package behavorialdesignpattern.mediator.mediatortestdemo;

public class Light {

    private boolean isOn = false; //flag or field
    private String location = "";

    public Light(String location) {
        this.location = location;
    }

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
