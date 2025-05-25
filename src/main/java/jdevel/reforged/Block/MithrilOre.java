package jdevel.reforged.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MithrilOre extends BlockBase {
    public MithrilOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(4f);
        setResistance(6f);
        setHarvestLevel("pickaxe", 3);
    }
}
