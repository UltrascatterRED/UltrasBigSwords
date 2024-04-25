package net.ultrascatterred.ultrasbigswords.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ultrascatterred.ultrasbigswords.UltrasBigSwords;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UltrasBigSwords.MOD_ID);
    public static final RegistryObject<SwordItem> WOODCLAYMORE =
            ITEMS.register("wood_claymore",
                    () -> new SwordItem(Tiers.WOOD,
                            5,
                            -2.9f,
                            new Item.Properties()));
    public static final RegistryObject<SwordItem> STONECLAYMORE =
            ITEMS.register("stone_claymore", () -> new SwordItem(Tiers.STONE, 5, -2.9f,new Item.Properties()));
    public static final RegistryObject<SwordItem> IRONCLAYMORE =
            ITEMS.register("iron_claymore", () -> new SwordItem(Tiers.IRON, 5, -2.9f,new Item.Properties()));
    public static final RegistryObject<SwordItem> GOLDCLAYMORE =
            ITEMS.register("gold_claymore", () -> new SwordItem(Tiers.GOLD, 5, -2.9f,new Item.Properties()));
    public static final RegistryObject<SwordItem> DIAMONDCLAYMORE =
            ITEMS.register("diamond_claymore", () -> new SwordItem(Tiers.DIAMOND, 6, -2.9f,new Item.Properties()));
    public static final RegistryObject<SwordItem> NETHERITECLAYMORE =
            ITEMS.register("netherite_claymore", () -> new SwordItem(Tiers.NETHERITE, 6, -2.9f,new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
