package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.holycrusade.procedures.DemonStoneSigilEntityWalksOnTheBlockProcedure;

public class DemonStoneSigilBlock extends Block {
	public DemonStoneSigilBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(4f, 12f).lightLevel(blockstate -> 10).requiresCorrectToolForDrops().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 2;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		DemonStoneSigilEntityWalksOnTheBlockProcedure.execute(entity);
	}
}