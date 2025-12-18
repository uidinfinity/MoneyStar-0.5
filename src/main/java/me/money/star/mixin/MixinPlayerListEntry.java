package me.money.star.mixin;

import me.money.star.util.traits.Util;
import net.minecraft.client.network.PlayerListEntry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PlayerListEntry.class)
public class MixinPlayerListEntry implements Util {

}