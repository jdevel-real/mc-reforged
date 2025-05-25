package jdevel.reforged.init;

import jdevel.reforged.Item.ItemBase;
import jdevel.reforged.Item.armor.ArmorBase;
import jdevel.reforged.Item.tool.*;
import jdevel.reforged.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    /*
    Mithril >> Mythril in Localization
     */

    // MATERIALS
    public static final Item.ToolMaterial MATERIAL_MITHRIL = EnumHelper.addToolMaterial("material_mithril",
            4,
            6244,
            10.0f,
            4.0f,
            15);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_MITHRIL = EnumHelper.addArmorMaterial("armor_material_mithril",
            Reference.MODID + ":mithril",
            132,
            new int[]{4, 7, 9, 4},
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            3.0f);

    // ITEMS
    public static final Item COPPER = new ItemBase("copper");
    public static final Item MITHRIL = new ItemBase("mithril");

    // TOOLS + ARMOR
    public static final ItemSword MITHRIL_SWORD = new ToolSword("mithril_sword", MATERIAL_MITHRIL);
    public static final ItemPickaxe MITHRIL_PICKAXE = new ToolPickaxe("mithril_pickaxe", MATERIAL_MITHRIL);
    public static final ItemAxe MITHRIL_AXE = new ToolAxe("mithril_axe", MATERIAL_MITHRIL);
    public static final ItemSpade MITHRIL_SHOVEL = new ToolSpade("mithril_shovel", MATERIAL_MITHRIL);
    public static final ItemHoe MITHRIL_HOE = new ToolHoe("mithril_hoe", MATERIAL_MITHRIL);

    public static final Item MITHRIL_HELMET = new ArmorBase("mithril_helmet", ARMOR_MATERIAL_MITHRIL, 1, EntityEquipmentSlot.HEAD);
    public static final Item MITHRIL_CHESTPLATE = new ArmorBase("mithril_chestplate", ARMOR_MATERIAL_MITHRIL, 1, EntityEquipmentSlot.CHEST);
    public static final Item MITHRIL_LEGGINGS = new ArmorBase("mithril_leggings", ARMOR_MATERIAL_MITHRIL, 2, EntityEquipmentSlot.LEGS);
    public static final Item MITHRIL_BOOTS = new ArmorBase("mithril_boots", ARMOR_MATERIAL_MITHRIL, 1, EntityEquipmentSlot.FEET);
}
