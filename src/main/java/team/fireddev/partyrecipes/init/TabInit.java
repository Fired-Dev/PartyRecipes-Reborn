package team.fireddev.partyrecipes.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import javax.annotation.Nonnull;

public class TabInit extends CreativeModeTab {
    private TabInit(int index, String label) {
        super(index, label);
    }

    @Override
    @Nonnull
    public ItemStack makeIcon() {
        return new ItemStack(Items.APPLE);
    }

    public static final TabInit instance = new TabInit(CreativeModeTab.TABS.length, "partyrecipes");
}
