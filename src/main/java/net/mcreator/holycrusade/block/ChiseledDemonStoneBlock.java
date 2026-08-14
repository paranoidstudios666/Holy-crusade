package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ChiseledDemonStoneBlock extends Block {
	public ChiseledDemonStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(4f, 12f).requiresCorrectToolForDrops());
	}
}