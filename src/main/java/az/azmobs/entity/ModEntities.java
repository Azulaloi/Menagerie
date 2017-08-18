package az.azmobs.entity;

import az.azmobs.AzMobs;
import az.azmobs.client.RenderFireBat;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Azulaloi on 8/18/2017
 */
public class ModEntities {
    public static void init(){
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(AzMobs.MODID, "firebat"), EntityFireBat.class, "firebat", id++, AzMobs.instance, 64, 3, true, 0x7F0000, 0xCE3D00);

//        LootTableList.register(EntityFireBat.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        RenderingRegistry.registerEntityRenderingHandler(EntityFireBat.class, RenderFireBat.RENDER_FACTORY);
    }
}