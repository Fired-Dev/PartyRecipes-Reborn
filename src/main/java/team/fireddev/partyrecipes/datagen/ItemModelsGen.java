package team.fireddev.partyrecipes.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import team.fireddev.partyrecipes.PartyRecipes;

public class ItemModelsGen extends ItemModelProvider {
    private static final String[] listAllItem={"jar","cup","reedjuice","concentratedsyrup","dough","flour"};
    public ItemModelsGen(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, PartyRecipes.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for(int i=0;i<listAllItem.length;i++){
            this.singleTexture(listAllItem[i], mcLoc("item/generated"), "layer0", modLoc("item/"+listAllItem[i]));
        }
    }
}
