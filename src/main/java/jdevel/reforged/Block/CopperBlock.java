package jdevel.reforged.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperBlock extends BlockBase {
    public CopperBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(4f);
        setResistance(3f);
        setHarvestLevel("pickaxe", 1);
    }
}
