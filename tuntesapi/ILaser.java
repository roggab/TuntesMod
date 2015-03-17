package tuntesapi;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;

public interface ILaser {

   void performActionOnEntitiesBoth(List var1, int var2);

   void performActionOnEntitiesClient(List var1, int var2);

   void performActionOnEntitiesServer(List var1, int var2);

   boolean shouldRenderLaser(EntityPlayer var1, int var2);
}
