package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class OldStoneTileWallBlock extends WallBlock {
	public OldStoneTileWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.5f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}