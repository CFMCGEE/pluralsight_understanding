package behavorialdesignpattern.command.commandtestdemo;

import java.util.*;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {

        for (Light light : lights) {

            if (light.isOn()) {
                light.toggle();
            }

        }

    }

}
