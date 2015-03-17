package tuntesapi;

import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class LaserWhitelist {

   public static int ALL_METADATA = -1;
   public static ArrayList WHITELIST = new ArrayList();


   public static void addToWhiteList(Block block, int blockMeta) {
      addToWhiteList(block.blockID, blockMeta);
   }

   public static void addToWhiteList(int blockId) {
      addToWhiteList(blockId, -1);
   }

   public static void addToWhiteList(Block block) {
      addToWhiteList(block.blockID, -1);
   }

   public static void addToWhiteList(int blockId, int blockMeta) {
      if(blockMeta == ALL_METADATA) {
         for(int i = 0; i < 16; ++i) {
            WHITELIST.add(Integer.valueOf(blockId + Block.blocksList.length * i));
         }
      } else {
         WHITELIST.add(Integer.valueOf(blockId + Block.blocksList.length * blockMeta));
      }

   }

   public static boolean canLaserPassThrought(World world, int x, int y, int z) {
      Chunk chunk = world.getChunkFromBlockCoords(x, z);
      return chunk != null && chunk.isChunkLoaded?canLaserPassThrought(world.getBlockId(x, y, z), world.getBlockMetadata(x, y, z)):false;
   }

   public static boolean canLaserPassThrought(int blockId, int blockMeta) {
      return WHITELIST.contains(Integer.valueOf(blockId + Block.blocksList.length * blockMeta));
   }

   static {
      addToWhiteList(0);
      addToWhiteList(Block.tallGrass);
      addToWhiteList(Block.leaves);
      addToWhiteList(Block.lever);
      addToWhiteList(Block.torchRedstoneActive);
      addToWhiteList(Block.torchRedstoneIdle);
      addToWhiteList(Block.torchWood);
      addToWhiteList(Block.redstoneWire);
      addToWhiteList(Block.glass);
   }
}
