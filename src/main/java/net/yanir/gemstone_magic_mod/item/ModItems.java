package net.yanir.gemstone_magic_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yanir.gemstone_magic_mod.gemstoneMagicMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, gemstoneMagicMod.MOD_ID);

    public static final RegistryObject<Item> STRENGTH_GEMSTONE = ITEM.register("strength_gemstone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
