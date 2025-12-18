package me.money.star.client.modules.render;

import me.money.star.client.gui.modules.Module;
import me.money.star.client.settings.Setting;

public class Environment extends Module {
    public Setting<Boolean> timeChange  = bool("Time", false);
    public Setting<Integer> time = num("Time",  200, -200, 200);
    public Environment() {
        super("Environment", "Draws box at the block that you are looking at", Category.RENDER, true, false, false);
    }
}