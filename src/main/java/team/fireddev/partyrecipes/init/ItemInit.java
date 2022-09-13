package team.fireddev.partyrecipes.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import team.fireddev.partyrecipes.PartyRecipes;

public class ItemInit {
    public static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, PartyRecipes.MODID);
    public static final Item.Properties BaseProperties = new Item.Properties().tab(TabInit.instance);


    public static final RegistryObject<Item> JAR = ItemRegister.register("jar", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> CUP = ItemRegister.register("cup", () -> new Item(BaseProperties));

}
