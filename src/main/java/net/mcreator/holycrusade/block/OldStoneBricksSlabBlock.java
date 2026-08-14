package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class OldStoneBricksSlabBlock extends SlabBlock {
	public OldStoneBricksSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.5f, 10f).requiresCorrectToolForDrops());
	}
}