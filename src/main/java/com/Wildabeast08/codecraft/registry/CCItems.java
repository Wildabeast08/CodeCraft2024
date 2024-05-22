package com.Wildabeast08.codecraft.registry;

import com.Wildabeast08.codecraft.CodeCraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CodeCraft.MOD_ID);

    //Items go here
    public static final DeferredItem<Item> EXAMPLE_ITEM =ITEMS.registerItem("sword_item", (properties -> new SwordItem(Tiers.NETHERITE, 1000, -2.4F, new Item.Properties().rarity(Rarity.EPIC).fireResistant().durability(1).defaultDurability(1))));

    public static final DeferredItem<Item> SECOND_ITEM = ITEMS.registerSimpleItem("second_item", new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().meat().nutrition(10).build()));

    public static final DeferredItem<Item> THIRD_ITEM = ITEMS.registerSimpleItem("third_item", new Item.Properties().stacksTo(64));

    public static final DeferredItem<Item> FOURTH_ITEM = ITEMS.registerSimpleItem("fourth_item", new Item.Properties().stacksTo(64));

  //  public static final DeferredItem<Item> FIFTH_ITEM = ITEMS.registerSimpleItem("fifth_item",new Item.Properties().stacksTo(1)); for shield

   // public static final ArmorMaterial; for my armor!!

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
