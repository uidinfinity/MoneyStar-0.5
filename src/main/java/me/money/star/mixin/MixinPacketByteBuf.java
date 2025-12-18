package me.money.star.mixin;

import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtSizeTracker;
import net.minecraft.network.PacketByteBuf;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PacketByteBuf.class)
public abstract class MixinPacketByteBuf {
    @Shadow
    @Nullable
    public abstract NbtElement readNbt(NbtSizeTracker sizeTracker);

    /**
     *
     * @param ops
     * @param codec
     * @param sizeTracker
     * @param cir
     */

}