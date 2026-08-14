package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DemonStoneBricksBlock extends Block {
	public DemonStoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(4f, 12f).requiresCorrectToolForDrops());
	}
}