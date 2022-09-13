package team.fireddev.partyrecipes.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import team.fireddev.partyrecipes.PartyRecipes;

public class ItemModelsGen extends ItemModelProvider {
    public ItemModelsGen(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, PartyRecipes.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture("jar", mcLoc("item/generated"), "layer0", modLoc("item/jar"));
        this.singleTexture("cup", mcLoc("item/generated"), "layer0", modLoc("item/cup"));
    }
}
