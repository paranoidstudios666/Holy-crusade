package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class DemonStoneStairsBlock extends StairBlock {
	public DemonStoneStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(4f, 12f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 12f;
	}
}