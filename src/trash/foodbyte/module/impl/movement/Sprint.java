/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class363;
import eventapi.EventTarget;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.value.BooleanValue;

public class Sprint
extends Module {
    public static boolean Field2427 = true;
    public BooleanValue omni = new BooleanValue("Sprint", "Omni", (Boolean)false, "\u5168\u65b9\u4f4d\u75be\u8dd1");

    public Sprint() {
        super("Sprint", Category.MOVEMENT);
    }

    @Override
    public String getDescription() {
        return "\u5f3a\u5236\u75be\u8dd1";
    }

    @EventTarget
    public void Method810(EventRender2D a) {
        Field2427 = this.omni.getBooleanValue();
        if (this.Method713()) {
            Sprint.mc.thePlayer.setSprinting(true);
        }
    }

    private boolean Method713() {
        if (!this.omni.getBooleanValue().booleanValue() && !Sprint.mc.gameSettings.keyBindForward.isKeyDown()) {
            return false;
        }
        if (Sprint.mc.thePlayer.isSneaking()) {
            return false;
        }
        if (!Class363.Method642() && (Sprint.mc.thePlayer.getItemInUseDuration() > 0 || !this.omni.getBooleanValue().booleanValue() && Sprint.mc.thePlayer.isCollidedHorizontally)) {
            return false;
        }
        return PlayerUtils.isMoving() && Sprint.mc.thePlayer.getFoodStats().getFoodLevel() > 6;
    }
}