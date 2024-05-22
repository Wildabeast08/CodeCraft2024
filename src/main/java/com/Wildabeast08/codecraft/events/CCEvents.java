package com.Wildabeast08.codecraft.events;

import com.Wildabeast08.codecraft.CodeCraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;

@Mod.EventBusSubscriber(modid = CodeCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CCEvents {

    @SubscribeEvent
    public static void doAThing(LivingAttackEvent event) {

    }

}
