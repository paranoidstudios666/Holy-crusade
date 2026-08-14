package net.mcreator.holycrusade.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class OldBowlBlock extends Block {
	private static final VoxelShape SHAPE = Shapes.or(box(12, 4, 2, 14, 6, 14), box(4, 4, 12, 12, 6, 14), box(4, 4, 2, 12, 6, 4), box(2, 4, 2, 4, 6, 14), box(3, 0, 3, 13, 1, 13));

	public OldBowlBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}