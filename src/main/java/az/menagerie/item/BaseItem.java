package az.menagerie.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;

public class BaseItem extends Item {
    public String ID = Loader.instance().activeModContainer().getModId().toLowerCase();

    public BaseItem(String name, CreativeTabs creativeTab) {
        setUnlocalizedName(ID + "." + name);
        setRegistryName(name);
        if (creativeTab != null) {
            setCreativeTab(creativeTab);
        }
    }

    public BaseItem(String name) {
        setUnlocalizedName(ID + "." + name);
        setRegistryName(name);
    }
}
