package com.michallejacob0.realisticcastlemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class RealisticCastleMod implements ModInitializer {
    public static final String MOD_ID = "realisticcastlemod";

    public static final Block CASTLE_WALL = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block CASTLE_TOWER = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block CASTLE_GATE = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool());

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "castle_wall"), CASTLE_WALL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "castle_wall"), new BlockItem(CASTLE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "castle_tower"), CASTLE_TOWER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "castle_tower"), new BlockItem(CASTLE_TOWER, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "castle_gate"), CASTLE_GATE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "castle_gate"), new BlockItem(CASTLE_GATE, new Item.Settings().group(ItemGroup.REDSTONE)));
    }
}
