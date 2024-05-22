package com.Wildabeast08.codecraft;

import com.Wildabeast08.codecraft.registry.CCBlocks;
import com.Wildabeast08.codecraft.registry.CCCreativeModeTabs;
import com.Wildabeast08.codecraft.registry.CCItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CodeCraft.MOD_ID)
public class CodeCraft
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "codecraft";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public CodeCraft(IEventBus modEventBus) {

        CCItems.register(modEventBus);
        CCBlocks.register(modEventBus);
        CCCreativeModeTabs.register(modEventBus);

    }

}
