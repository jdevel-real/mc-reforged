package jdevel.reforged.init;

import jdevel.reforged.Block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
    public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
    public static final Block MITHRIL_BLOCK = new MithrilBlock("mithril_block", Material.IRON);
    public static final Block MITHRIL_ORE = new MithrilOre("mithril_ore", Material.ROCK);
}
