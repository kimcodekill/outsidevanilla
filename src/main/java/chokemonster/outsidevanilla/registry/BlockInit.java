package chokemonster.outsidevanilla.registry;

import chokemonster.outsidevanilla.Reference;
import chokemonster.outsidevanilla.blocks.CompressedCropsBlock;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> BlockRegistryEvent) {

        BlockRegistryEvent.getRegistry().registerAll(
                new CompressedCropsBlock().setRegistryName(Reference.MODID, "compressed_wheat")
        );
    }
}