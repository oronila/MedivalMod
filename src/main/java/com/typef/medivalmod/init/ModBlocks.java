package com.typef.medivalmod.init;

import java.util.ArrayList;
import java.util.List;

import com.typef.medivalmod.blocks.BlockBase;
import com.typef.medivalmod.blocks.CopperBlock;
import com.typef.medivalmod.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	
}
