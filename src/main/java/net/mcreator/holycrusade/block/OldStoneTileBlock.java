package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class OldStoneTileBlock extends Block {
	public OldStoneTileBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.5f, 10f).requiresCorrectToolForDrops());
	}
}