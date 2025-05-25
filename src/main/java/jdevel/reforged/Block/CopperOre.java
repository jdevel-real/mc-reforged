package jdevel.reforged.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperOre extends BlockBase {
    public CopperOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(3f);
        setResistance(2.5f);
        setHarvestLevel("pickaxe", 1);
    }
}
