package net.yanir.gemstone_magic_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yanir.gemstone_magic_mod.gemstoneMagicMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, gemstoneMagicMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GEMSTONE_TAB = CREATIVE_MODE_TABS.register("gemstone_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STRENGTH_GEMSTONE.get()))
            .title(Component.translatable("creativetab.GEMSTONE_TAB"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.STRENGTH_GEMSTONE.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
