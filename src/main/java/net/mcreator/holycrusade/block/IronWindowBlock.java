package net.mcreator.holycrusade.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class IronWindowBlock extends IronBarsBlock {
	public IronWindowBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(2.5f, 10f).requiresCorrectToolForDrops());
	}
}