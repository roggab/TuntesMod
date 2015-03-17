package tuntesapi;

import net.minecraft.world.World;

public interface ILaserReciver {

   boolean canPassOnSide(World var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   boolean isSendingSignalFromSide(World var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   void passLaser(World var1, int var2, int var3, int var4, int var5, int var6, int var7, LaserInGame var8);

   void removeLasersFromSide(World var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);
}
