package tuntesapi;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.minecraft.item.ItemStack;

public class LaserRegistry {

   private static Hashtable mappings = new Hashtable();
   private static Hashtable mappingItems = new Hashtable();


   public static void registerLaser(String id, ILaser laser) {
      if(!mappings.keySet().contains(id)) {
         mappings.put(id, laser);
      }

   }

   public static void registerItemToLaser(int id, int meta, ILaser laser) {
      List list = Arrays.asList(new Integer[]{Integer.valueOf(id), Integer.valueOf(meta)});
      if(!mappingItems.keySet().contains(list)) {
         mappingItems.put(list, laser);
      }

   }

   public static ILaser getLaserFromItem(ItemStack stack) {
      List list = Arrays.asList(new Integer[]{Integer.valueOf(stack.itemID), Integer.valueOf(stack.getItemDamage())});
      return mappingItems.keySet().contains(list)?(ILaser)mappingItems.get(list):null;
   }

   public static ILaser getLaserFromId(String id) {
      return (ILaser)mappings.get(id);
   }

   public static String getIdFromLaser(ILaser laser) {
      Set keySet = mappings.keySet();
      Iterator i$ = keySet.iterator();

      String id;
      do {
         if(!i$.hasNext()) {
            return "default";
         }

         id = (String)i$.next();
      } while(mappings.get(id) != laser);

      return id;
   }

}
