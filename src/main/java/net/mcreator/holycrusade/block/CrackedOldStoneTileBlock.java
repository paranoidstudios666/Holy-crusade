package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CrackedOldStoneTileBlock extends Block {
	public CrackedOldStoneTileBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.5f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}