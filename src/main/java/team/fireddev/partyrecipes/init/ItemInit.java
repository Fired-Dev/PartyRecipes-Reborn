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
    public static final RegistryObject<Item> ICECUBE = ItemRegister.register("icecube", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> THINSTICK = ItemRegister.register("thinstick", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> GRASSASH = ItemRegister.register("grassash", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> SODA = ItemRegister.register("soda", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> SALT = ItemRegister.register("salt", () -> new Item(BaseProperties));
    public static final RegistryObject<Item> PAPERFILTER = ItemRegister.register("paper_filter", () -> new Item(BaseProperties));
}
