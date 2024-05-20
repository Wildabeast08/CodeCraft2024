package com.Wildabeast08.codecraft;

import com.mojang.logging.LogUtils;
import com.your_name.your_mod_id.registry.YMIBlocks;
import com.your_name.your_mod_id.registry.YMICreativeModeTabs;
import com.your_name.your_mod_id.registry.YMIItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CodeCraft.MOD_ID)
public class CodeCraft
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "CodeCraft";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public CodeCraft(IEventBus modEventBus) {

        CCItems.register(modEventBus);
        CCBlocks.register(modEventBus);
        CCCreativeModeTabs.register(modEventBus);

    }

}
