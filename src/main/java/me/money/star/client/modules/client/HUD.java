package me.money.star.client.modules.client;

import me.money.star.client.gui.modules.Module;
import me.money.star.event.impl.Render2DEvent;
import me.money.star.util.traits.Util;

// autism

public class HUD extends Module {
    public HUD() {
        super("HUD", "hud", Category.CLIENT, true, false, false);
    }

    @Override
    public void onRender2D(Render2DEvent event) {
        event.getContext().drawTextWithShadow(
                Util.mc.textRenderer,
                "moneystar-0.6-upgrade",
                2, 2,
                -1
        );
    }
}