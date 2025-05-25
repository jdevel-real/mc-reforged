package jdevel.reforged.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER), 0.3f);
        GameRegistry.addSmelting(ModBlocks.MITHRIL_ORE, new ItemStack(ModItems.MITHRIL), 0.9f);
    }
}
