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
    public static final RegistryObject<Item> REEDJUICE = ItemRegister.register("reedjuice", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> CONCENTRATEDSYRUP = ItemRegister.register("concentratedsyrup", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> DOUGH = ItemRegister.register("dough", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> FLOUR = ItemRegister.register("flour", () -> new Item(BaseProperties));
}
