/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C02PacketUseEntity
 *  net.minecraft.network.play.client.C02PacketUseEntity$Action
 *  net.minecraft.network.play.client.C0BPacketEntityAction
 *  net.minecraft.network.play.client.C0BPacketEntityAction$Action
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.skyblock;

import awsl.Class98;
import eventapi.EventTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.world.World;
import obfuscate.a;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class SlayerHelper
extends Module {
    public static BooleanValue Field3134 = new BooleanValue("SlayerHelper", "Auto Senak", (Boolean)true, "\u5f53\u4f60\u5237\u672b\u5f71\u4ebaSlayer\u65f6\n\u6bcf\u4e00\u6b21\u653b\u51fb\u81ea\u52a8\u5e2e\u4f60\u53d1\u5305Senak\u8e72\u4e0b\n\u89e6\u53d1\u5957\u88c5\u88ab\u52a8\n\u00a7e\u6ce8: \u53ea\u5bf9Void Sepulture\u91cc\u7684\u672b\u5f71\u4eba\u751f\u6548");
    public boolean Field3135;
    public int Field3136;

    public SlayerHelper() {
        super("SlayerHelper", "Slayer Helper", Category.SKYBLOCK);
        this.setDescription("\u6682\u65f6\u65e0\u7528");
    }

    @EventTarget
    public void Method1655(EventTick a2) {
        ++this.Field3136;
        int[] nArray = Class98.Method3639();
        if (this.Field3135 && this.Field3136 > 5) {
            this.Field3135 = !this.Field3135;
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)SlayerHelper.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SNEAKING));
            a.trash(new String[1]);
        }
        if (this.Field3135) {
            // empty if block
        }
    }

    @EventTarget
    public void Method1994(EventMove a2) {
        if (this.Field3135) {
            a2.x *= 0.5;
            a2.z *= 0.5;
        }
    }

    @EventTarget
    public void Method1186(EventPacket a2) {
        int[] a3 = Class98.Method3639();
        if (a2.isSend() && Field3134.getBooleanValue().booleanValue()) {
            C02PacketUseEntity a4;
            if (a2.getPacket() instanceof C02PacketUseEntity) {
                a4 = (C02PacketUseEntity)a2.getPacket();
                if (a4.getAction() == C02PacketUseEntity.Action.ATTACK && a4.getEntityFromWorld((World)SlayerHelper.mc.theWorld) instanceof EntityEnderman) {
                    EntityEnderman a5 = (EntityEnderman)a4.getEntityFromWorld((World)SlayerHelper.mc.theWorld);
                    this.Field3136 = 0;
                    if (!this.Field3135 && a5.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() >= 750000.0) {
                        this.Field3135 = !this.Field3135;
                        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)SlayerHelper.mc.thePlayer, C0BPacketEntityAction.Action.START_SNEAKING));
                    }
                    if (this.Field3135 && SlayerHelper.mc.currentScreen != null) {
                        SlayerHelper.mc.thePlayer.closeScreen();
                    }
                }
            }
            if (a2.getPacket() instanceof C0BPacketEntityAction) {
                a4 = (C0BPacketEntityAction)a2.getPacket();
                if (this.Field3135 && (a4.getAction().equals((Object)C0BPacketEntityAction.Action.START_SNEAKING) || a4.getAction().equals((Object)C0BPacketEntityAction.Action.STOP_SNEAKING))) {
                    a2.setCancelled(true);
                }
            }
        }
    }
}