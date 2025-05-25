package jdevel.reforged.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MithrilBlock extends BlockBase {
    public MithrilBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(5f);
        setResistance(7f);
        setHarvestLevel("pickaxe", 3);
    }
}
