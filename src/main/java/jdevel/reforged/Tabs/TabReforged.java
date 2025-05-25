package jdevel.reforged.Tabs;

import jdevel.reforged.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabReforged extends CreativeTabs {
    public TabReforged(String label) {
        super("reforged");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.MITHRIL);
    }
}
