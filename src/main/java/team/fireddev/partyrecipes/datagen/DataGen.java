package team.fireddev.partyrecipes.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import team.fireddev.partyrecipes.PartyRecipes;

@Mod.EventBusSubscriber(modid = PartyRecipes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeClient()) {
            generator.addProvider(true, new ItemModelsGen(generator, event.getExistingFileHelper()));
        }
    }
}
