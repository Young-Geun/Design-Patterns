package org.example.designpatterns._03_behavioral._14_command._02_after;

import org.example.designpatterns._03_behavioral._14_command._01_before.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }

}
