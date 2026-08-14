package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class DemonStoneSabBlock extends SlabBlock {
	public DemonStoneSabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(4f, 12f).requiresCorrectToolForDrops());
	}
}