package tuntesapi;

import java.util.HashSet;
import net.minecraft.entity.Entity;

public interface ISpaceship {

   Entity[] getSpaceshipParts();

   HashSet getPossiblePlanets();

   int getYCoordToTeleport();

   int getPreLaunchWait();
}
