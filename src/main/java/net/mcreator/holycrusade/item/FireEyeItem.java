package net.mcreator.holycrusade.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.holycrusade.procedures.FireEyeRightclickedProcedure;

public class FireEyeItem extends Item {
	public FireEyeItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		FireEyeRightclickedProcedure.execute(entity, entity.getItemInHand(hand));
		return ar;
	}
}