package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class DemonStoneWallBlock extends WallBlock {
	public DemonStoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(4f, 12f).requiresCorrectToolForDrops().forceSolidOn());
	}
}