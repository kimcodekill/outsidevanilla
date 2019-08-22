package chokemonster.outsidevanilla.registry;

import chokemonster.outsidevanilla.Reference;
import chokemonster.outsidevanilla.blocks.Blocks;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit {

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> ItemRegistryEvent) {

        ItemRegistryEvent.getRegistry().registerAll(
                new BlockNamedItem(Blocks.compressed_wheat, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(Reference.MODID, "compressed_wheat_seeds")
        );
    }
}