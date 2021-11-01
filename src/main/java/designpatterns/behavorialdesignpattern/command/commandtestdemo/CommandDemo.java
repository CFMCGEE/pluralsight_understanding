package designpatterns.behavorialdesignpattern.command.commandtestdemo;

import java.util.*;

//client
public class CommandDemo {


    public static void main(String[] args) {

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

      //Command onCommand = new OnCommand(light);

      Command toggleCommand = new ToggleCommand(bedroomLight);

      //maintaining state
        lightSwitch.storeAndExecute(toggleCommand);
        //lightSwitch.storeAndExecute(toggleCommand);
        //lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();

        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
