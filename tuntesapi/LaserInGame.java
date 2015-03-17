package tuntesapi;

import ic2.api.Items;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LaserInGame {

   private double strength = 100.0D;
   private ArrayList laserType = new ArrayList();
   private int side = -1;
   public int red = 255;
   public int green = 0;
   public int blue = 0;


   public LaserInGame(ILaser laser) {
      this.laserType.add(laser);
   }

   public LaserInGame(ArrayList lasers) {
      this.laserType.addAll(lasers);
   }

   public LaserInGame setStrength(double strength) {
      if(strength < 0.0D) {
         strength = 0.0D;
      }

      this.strength = strength;
      return this;
   }

   public LaserInGame setSide(int side) {
      this.side = side;
      return this;
   }

   public LaserInGame setLaserType(ILaser laser) {
      this.laserType.clear();
      this.laserType.add(laser);
      return this;
   }

   public LaserInGame addLaserType(ILaser laser) {
      this.laserType.add(laser);
      return this;
   }

   public LaserInGame setLaserType(String laser) {
      return this.setLaserType(LaserRegistry.getLaserFromId(laser));
   }

   public LaserInGame addLaserType(String laser) {
      return this.setLaserType(LaserRegistry.getLaserFromId(laser));
   }

   public double getStrength() {
      return this.strength;
   }

   public ArrayList getLaserType() {
      return this.laserType;
   }

   public void readFromNBT(NBTTagCompound tag) {}

   @SideOnly(Side.CLIENT)
   public float shouldRenderLaser(EntityPlayer player) {
      Iterator i$ = this.laserType.iterator();

      ILaser laser;
      do {
         if(!i$.hasNext()) {
            return 0.4F;
         }

         laser = (ILaser)i$.next();
      } while(laser.shouldRenderLaser(player, this.side));

      return player.inventory.armorInventory[3] != null && (player.inventory.armorInventory[3].itemID == TuntesItems.getItemFromGravi("GraviHelmet").itemID || player.inventory.armorInventory[3].itemID == Items.getItem("nanoHelmet").itemID || player.inventory.armorInventory[3].itemID == Items.getItem("quantumHelmet").itemID)?0.1F:0.0F;
   }

   public void writeToNBT(NBTTagCompound tag) {}

   public LaserInGame copy() {
      LaserInGame laser = new LaserInGame((ArrayList)this.laserType.clone());
      laser.setSide(this.side);
      laser.setStrength(this.getStrength());
      laser.red = this.red;
      laser.green = this.green;
      laser.blue = this.blue;
      return laser;
   }

   public int getSide() {
      return this.side;
   }

   public int laserCount() {
      return this.laserType.size();
   }
}
